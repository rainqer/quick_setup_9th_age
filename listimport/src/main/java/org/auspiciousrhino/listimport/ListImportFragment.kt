package org.auspiciousrhino.listimport

import android.content.ClipboardManager
import android.content.Context
import android.content.Context.CLIPBOARD_SERVICE
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.listimport.databinding.FragmentListimportBinding
import org.auspiciousrhino.navigation.Navigation
import org.auspiciousrhino.ui.ArmyListEntryView
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class ListImportFragment : Fragment() {

  private lateinit var binding: FragmentListimportBinding
  private val model: ListImportViewModel by viewModel()

  private val navigation: Navigation by inject()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentListimportBinding.inflate(layoutInflater)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    model.state.observe(viewLifecycleOwner) {
      when (it) {
        is ListImportState.Start -> setupStartState()
        is ListImportState.Empty -> setupErrorState(it.rawArmyList)
        is ListImportState.Imported -> { /*no-op*/ }
      }
    }
    model.navigationEvents.observe(viewLifecycleOwner) {
      navigation.consume(it, view)
    }
    binding.activityListimportStart.importListFromClipboardButton.setOnClickListener {
      importListBasedOnTextInClipboard()
    }
    binding.activityListimportError.importListFromClipboardButton.setOnClickListener {
      importListBasedOnTextInClipboard()
    }
    model.start()
  }

  private fun importListBasedOnTextInClipboard() {
    val text = (requireActivity().getSystemService(CLIPBOARD_SERVICE) as ClipboardManager)
      .primaryClip
      ?.getItemAt(0)
      ?.text
      .toString()
    model.importArmyList(text)
  }

  private fun setupStartState() {
    binding.importListViewAnimator.displayedChild = START_INDEX
  }

  private fun setupErrorState(rawArmyList: String) {
    binding.importListViewAnimator.displayedChild = ERROR_INDEX
    binding.activityListimportError.incorrectList.text = rawArmyList
  }

  companion object {

    fun intent(context: Context) =
      Intent(context, ListImportFragment::class.java)
  }
}

private const val START_INDEX = 0
private const val ERROR_INDEX = 1
