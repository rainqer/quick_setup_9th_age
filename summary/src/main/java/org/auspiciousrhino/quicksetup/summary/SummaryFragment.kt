package org.auspiciousrhino.quicksetup.summary

import android.animation.LayoutTransition
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.auspiciousrhino.quicksetup.navigation.Navigation
import org.auspiciousrhino.quicksetup.summary.databinding.ActivitySummaryBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

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

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    model.init()
  }

  override fun onDestroyView() {
    _binding = null
    super.onDestroyView()
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    observeStates(view)
    enableAnimations()
    setupClickListeners()
  }

  private fun observeStates(view: View) {
    model.state.observe(viewLifecycleOwner) { summaryState ->
      binding.terrainLayout.viewEntity = summaryState.configuration.map
      binding.deployment.viewEntity = summaryState.configuration.deployment
      binding.primaryObjective.viewEntity = summaryState.configuration.primaryObjective
      binding.mySecondaryObjective.viewEntity = summaryState.configuration.mySecondaryObjectives
      binding.opponentSecondaryObjective.viewEntity = summaryState.configuration.opponentSecondaryObjectives
    }
    model.navigationEvents.observe(viewLifecycleOwner) { navigationEvent ->
      navigation.consume(navigationEvent, view)
    }
  }

  private fun setupClickListeners() {
    binding.enlargeTerrain.setOnClickListener { model.onTerrainLayoutEnlargeClicked() }
    binding.terrainLayout.setOnClickListener { model.onTerrainLayoutEnlargeClicked() }
    binding.deploymentCard.setOnClickListener {
      binding.deployment.verbose = !binding.deployment.verbose
    }
    binding.deploymentDetailsButton.setOnClickListener {
      binding.deployment.verbose = !binding.deployment.verbose
    }
    binding.primaryObjectiveCard.setOnClickListener {
      binding.primaryObjective.verbose = !binding.primaryObjective.verbose
    }
    binding.primaryObjectiveDetailsButton.setOnClickListener {
      binding.primaryObjective.verbose = !binding.primaryObjective.verbose
    }
    binding.generateNewConfigurationButton.setOnClickListener {
      model.generateNewConfiguration()
    }
    binding.mySecondaryObjective.verbose = true
    binding.opponentSecondaryObjective.verbose = true
  }

  private fun enableAnimations() {
    binding.summaryRoot.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
    binding.deploymentCard.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
    binding.primaryObjectiveCard.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
    binding.mySecondaryObjectiveCard.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
    binding.opponentSecondaryObjectiveCard.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
  }
}
