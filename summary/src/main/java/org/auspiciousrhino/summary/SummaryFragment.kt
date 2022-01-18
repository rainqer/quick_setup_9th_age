package org.auspiciousrhino.summary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.auspiciousrhino.navigation.Navigation
import org.auspiciousrhino.summary.databinding.ActivitySummaryBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.lang.IllegalStateException

class SummaryFragment : Fragment() {

  private val binding: ActivitySummaryBinding
    get() = _binding ?: throw IllegalStateException("binding not initialized")

  private var _binding: ActivitySummaryBinding? = null
  private val navigation: Navigation by inject()
  private val model: SummaryViewModel by viewModel()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    _binding = ActivitySummaryBinding.inflate(layoutInflater)
    return binding.root
  }

  override fun onDestroyView() {
    _binding = null
    super.onDestroyView()
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    model.state.observe(viewLifecycleOwner) { summaryState ->
      binding.terrainLayout.viewEntity = summaryState.configuration.map
      binding.deployment.viewEntity = summaryState.configuration.deployment
      binding.secondaryObjective.viewEntity = summaryState.configuration.secondaryObjective
    }
    model.navigationEvents.observe(viewLifecycleOwner) { navigationEvent ->
      navigation.consume(navigationEvent, requireContext())
    }
    model.init()
    binding.enlargeTerrain.setOnClickListener { model.onTerrainLayoutEnlargeClicked() }
    binding.terrainLayout.setOnClickListener { model.onTerrainLayoutEnlargeClicked() }
    binding.deploymentDetailsButton.setOnClickListener {
      binding.deployment.verbose = !binding.deployment.verbose
    }
    binding.secondaryObjectiveDetailsButton.setOnClickListener {
      binding.secondaryObjective.verbose = !binding.secondaryObjective.verbose
    }
    binding.generateNewConfigurationButton.setOnClickListener { model.generateNewConfiguration() }
  }

  companion object {

    fun new() = SummaryFragment()
  }
}