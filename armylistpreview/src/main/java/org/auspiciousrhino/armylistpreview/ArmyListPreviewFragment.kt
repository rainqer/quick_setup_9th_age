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

  private val armyListAdapter = ArmyListAdapter()

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
    observerStateEvents()
    observeNavigationEvents()
    setupButtons()
    setupInitialViews()
    model.start()
  }

  private fun observerStateEvents() {
    model.state.observe(viewLifecycleOwner) {
      when (it) {
        is ArmyListPreviewState.Start -> setupView(it.armyList)
      }
    }
  }

  private fun observeNavigationEvents() {
    model.navigationEvents.observe(viewLifecycleOwner) {
      navigation.consume(it, binding.root)
    }
  }

  private fun setupButtons() {
    requireActivity().onBackPressedDispatcher.addCallback(this) {
      navigation.consume(NavigationEvent.PopBackToBattleOutCome(), requireView())
    }
    binding.buttonOk.setOnClickListener {
      model.onOkPressed()
    }
  }

  private fun setupInitialViews() {
    binding.recyclerViewArmyListPreview.adapter = armyListAdapter
    binding.recyclerViewArmyListPreview.addItemDecoration(
      ListEntryDecoration(resources.getDimensionPixelSize(R.dimen.screen_padding))
    )
    binding.armyOwnerSpinner.adapter = ArrayAdapter.createFromResource(
      requireContext(),
      R.array.army_owner,
      android.R.layout.simple_spinner_dropdown_item
    )
  }

  private fun setupView(armyList: ArmyList) {
    armyListAdapter.submitList(armyList.entries)
  }
}
