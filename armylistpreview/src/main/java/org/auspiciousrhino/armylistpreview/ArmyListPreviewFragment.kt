package org.auspiciousrhino.armylistpreview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import org.auspiciousrhino.armylistpreview.databinding.FragmentArmylistpreviewBinding
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.navigation.Navigation
import org.auspiciousrhino.navigation.NavigationEvent
import org.auspiciousrhino.ui.ArmyListEntryView
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class ArmyListPreviewFragment : Fragment() {

  private lateinit var binding: FragmentArmylistpreviewBinding
  private val model: ArmyListPreviewViewModel by viewModel()
  private val navigation: Navigation by inject()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentArmylistpreviewBinding.inflate(layoutInflater)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    model.state.observe(viewLifecycleOwner) {
      when (it) {
        is ArmyListPreviewState.Start -> setupView(it.armyList)
      }
    }
    requireActivity().onBackPressedDispatcher.addCallback(this) {
      navigation.consume(NavigationEvent.PopBackToBattleOutCome(), requireView())
    }
  }

  private fun setupView(armyList: ArmyList) {
    val padding = resources.getDimensionPixelOffset(R.dimen.screen_padding)
    binding.listElementsContainer.removeAllViews()
    armyList.entries
      .map { ArmyListEntryView(requireContext()).apply { viewEntity = it } }
      .map { it.apply { setPadding(padding, padding, padding, padding) } }
      .forEach { binding.listElementsContainer.addView(it) }
    val arrayAdapter = ArrayAdapter.createFromResource(
      requireContext(),
      R.array.army_owner,
      android.R.layout.simple_spinner_dropdown_item
    )
    binding.armyOwnerSpinner.adapter = arrayAdapter
  }
}
