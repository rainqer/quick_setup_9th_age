package org.auspiciousrhino.armylistpreview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import org.auspiciousrhino.armylistpreview.databinding.FragmentArmylistpreviewBinding
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.ui.ArmyListEntryView
import org.koin.androidx.viewmodel.ext.android.viewModel


class ArmyListPreviewFragment : Fragment() {

  private lateinit var binding: FragmentArmylistpreviewBinding
  private val model: ArmyListPreviewViewModel by viewModel()

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
