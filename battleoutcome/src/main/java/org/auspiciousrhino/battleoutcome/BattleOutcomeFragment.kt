package org.auspiciousrhino.battleoutcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.auspiciousrhino.battleoutcome.databinding.FragmentBattleoutcomeBinding
import org.auspiciousrhino.navigation.Navigation
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class BattleOutcomeFragment : Fragment() {

  private lateinit var binding: FragmentBattleoutcomeBinding
  private val model: BattleOutcomeViewModel by viewModel()
  private val navigation: Navigation by inject()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    model.start()
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentBattleoutcomeBinding.inflate(layoutInflater)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    observeState()
    setupClickListeners()
  }

  private fun setupClickListeners() {
    binding.previewMyListButton.setOnClickListener {
      model.previewListClicked()
    }
  }

  private fun observeState() {
    model.state.observe(viewLifecycleOwner) {
      when (it) {
        is BattleOutcomeState.Start -> render(it)
        is BattleOutcomeState.Error -> TODO()
      }
    }
    model.navigationEvents.observe(viewLifecycleOwner) {
      navigation.consume(it, requireView())
    }
  }

  private fun render(viewState: BattleOutcomeState.Start) {
    binding.testListEntry.viewEntity = viewState.armyList.entries.first()
  }
}
