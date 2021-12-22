package org.auspiciousrhino.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import org.auspiciousrhino.domain.SecondaryObjective

class SecondaryObjectiveView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

  private val secondaryObjectiveTitle
    get() = findViewById<TextView>(R.id.secondaryObjectiveTitle)

  private val secondaryObjectiveDescriptionShort
    get() = findViewById<TextView>(R.id.secondaryObjectiveDescriptionShort)

  private val secondaryObjectiveDescription
    get() = findViewById<TextView>(R.id.secondaryObjectiveDescription)

  var verbose: Boolean = true
    set(value) {
      field = value
      val visibility = if (field) View.VISIBLE else View.GONE
      secondaryObjectiveDescriptionShort.visibility = visibility
      secondaryObjectiveDescription.visibility = visibility
    }

  init {
    inflate(context, R.layout.view_secondary_objective, this)
    orientation = VERTICAL
    val array = context.obtainStyledAttributes(attrs, R.styleable.SecondaryObjectiveView, R.attr.secondaryObjectiveViewStyle, 0)
    verbose = array.getBoolean(R.styleable.SecondaryObjectiveView_secondaryobjectiveview_verbose, true)
    array.recycle()
  }

  var viewEntity: SecondaryObjective? = null
    set(value) {
      field = value
      secondaryObjectiveTitle.setText(value?.name ?: 0)
      secondaryObjectiveDescriptionShort.setText(value?.descriptionShort ?: 0)
      secondaryObjectiveDescription.setText(value?.description ?: 0)
    }
}