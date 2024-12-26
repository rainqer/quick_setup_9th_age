package org.auspiciousrhino.quicksetup.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import android.widget.TextView
import org.auspiciousrhino.quicksetup.domain.ListEntry
import org.auspiciousrhino.quicksetup.resources.colors.R as Rcolors
import org.auspiciousrhino.quicksetup.resources.strings.R as Rstrings

class ArmyListEntryView @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyle: Int = 0
) : RelativeLayout(context, attrs, defStyle) {

  private val pointValueView
    get() = findViewById<TextView>(R.id.entryPointValue)

  private val titleView
    get() = findViewById<TextView>(R.id.entryTitle)

  private val detailsView
    get() = findViewById<TextView>(R.id.entryDetails)

  init {
    inflate(context, R.layout.view_army_list_entry, this)
    setBackgroundResource(Rcolors.color.white)
  }

  var viewEntity: ListEntry? = null
    set(value) {
      field = value
      if (value == null) return
      pointValueView.text = resources.getString(Rstrings.string.points, value.pointValue)
      titleView.text = value.name
      detailsView.text = value.details
    }
}