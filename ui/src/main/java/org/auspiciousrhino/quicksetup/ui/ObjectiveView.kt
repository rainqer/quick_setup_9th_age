package org.auspiciousrhino.quicksetup.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import org.auspiciousrhino.quicksetup.domain.Objective

class ObjectiveView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

  private val objectiveTitle
    get() = findViewById<TextView>(R.id.objectiveTitle)

  private val objectiveDescriptionShort
    get() = findViewById<TextView>(R.id.objectiveDescriptionShort)

  private val objectiveDescription
    get() = findViewById<TextView>(R.id.objectiveDescription)

  var verbose: Boolean = true
    set(value) {
      field = value
      val visibility = if (field) View.VISIBLE else View.GONE
      objectiveDescriptionShort.visibility = visibility
      objectiveDescription.visibility = visibility
    }

  init {
    inflate(context, R.layout.view_objective, this)
    orientation = VERTICAL
    val array = context.obtainStyledAttributes(attrs, R.styleable.objectiveView, R.attr.objectiveViewStyle, 0)
    verbose = array.getBoolean(R.styleable.objectiveView_objectiveview_verbose, true)
    array.recycle()
  }

  var viewEntity: Objective? = null
    set(value) {
      field = value
      objectiveTitle.setText(value?.name ?: 0)
      objectiveDescriptionShort.setText(value?.descriptionShort ?: 0)
      objectiveDescription.setText(value?.description ?: 0)
    }
}