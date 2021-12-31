package org.auspiciousrhino.listimport

import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import org.auspiciousrhino.listimport.databinding.ActivityListimportBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListImportActivity : ComponentActivity() {

  private lateinit var binding: ActivityListimportBinding
  private val model: ListImportViewModel by viewModel()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityListimportBinding.inflate(layoutInflater)
    setContentView(binding.root)
    model.state.observe(this) {
      when (it) {
        is ListImportState.Empty -> TODO()
        is ListImportState.Imported -> TODO()
        is ListImportState.Start -> TODO()
      }
    }
    binding.importListFromClipboardButton.setOnClickListener {
      val text = (getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager)
        .primaryClip
        ?.getItemAt(0)
        ?.text
        .toString()
      model.importArmyList(text)
    }
  }

  companion object {

    fun intent(context: Context) =
      Intent(context, ListImportActivity::class.java)
  }
}
