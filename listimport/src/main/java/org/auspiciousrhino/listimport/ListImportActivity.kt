package org.auspiciousrhino.listimport

import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.listimport.databinding.ActivityListimportBinding
import org.auspiciousrhino.ui.ArmyListEntryView
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.widget.ArrayAdapter


class ListImportActivity : ComponentActivity() {

  private lateinit var binding: ActivityListimportBinding
  private val model: ListImportViewModel by viewModel()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityListimportBinding.inflate(layoutInflater)
    setContentView(binding.root)
    model.state.observe(this) {
      when (it) {
        is ListImportState.Empty -> setupErrorState(it.rawArmyList)
        is ListImportState.Imported -> setupImportedState(it.armyList)
        is ListImportState.Start -> setupStartState()
      }
    }
    binding.activityListimportStart.importListFromClipboardButton.setOnClickListener {
      importListBasedOnTextInClipboard()
    }
    binding.activityListimportError.importListFromClipboardButton.setOnClickListener {
      importListBasedOnTextInClipboard()
    }
  }

  private fun importListBasedOnTextInClipboard() {
    val text = (getSystemService(CLIPBOARD_SERVICE) as ClipboardManager)
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

  private fun setupImportedState(armyList: ArmyList) {
    val padding = resources.getDimensionPixelOffset(R.dimen.screen_padding)
    binding.activityListimportImported.listElementsContainer.removeAllViews()
    armyList.entries
      .map { ArmyListEntryView(this).apply { viewEntity = it } }
      .map { it.apply { setPadding(padding, padding, padding, padding) } }
      .forEach { binding.activityListimportImported.listElementsContainer.addView(it) }
    val arrayAdapter = ArrayAdapter.createFromResource(
      this,
      R.array.army_owner,
      android.R.layout.simple_spinner_dropdown_item
    )
    binding.activityListimportImported.armyOwnerSpinner.adapter = arrayAdapter
    binding.importListViewAnimator.displayedChild = IMPORTED_INDEX
  }

  companion object {

    fun intent(context: Context) =
      Intent(context, ListImportActivity::class.java)
  }
}

private const val START_INDEX = 0
private const val ERROR_INDEX = 1
private const val IMPORTED_INDEX = 2
