package org.auspiciousrhino.quicksetup.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.auspiciousrhino.quicksetup.domain.Deployment
import android.animation.LayoutTransition


class DeploymentView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

  private val deploymentTitle
    get() = findViewById<TextView>(R.id.deploymentTitle)

  private val deploymentDescription
    get() = findViewById<TextView>(R.id.deploymentDescription)

  private val deploymentImage
    get() = findViewById<ImageView>(R.id.deploymentImage)

  var verbose: Boolean = true
    set(value) {
      field = value
      val visibility = if (field) View.VISIBLE else View.GONE
      deploymentImage.visibility = visibility
      deploymentDescription.visibility = visibility
    }

  init {
    inflate(context, R.layout.view_deployment, this)
    orientation = VERTICAL
    layoutTransition = LayoutTransition()
    val array = context.obtainStyledAttributes(
      attrs,
      R.styleable.DeploymentView,
      R.attr.deploymentViewStyle,
      0
    )
    verbose = array.getBoolean(R.styleable.DeploymentView_deploymentview_verbose, true)
    array.recycle()
  }

  var viewEntity: Deployment? = null
    set(value) {
      field = value
      deploymentTitle.setText(value?.name ?: 0)
      deploymentImage.setImageResource(value?.image ?: 0)
      deploymentDescription.setText(value?.description ?: 0)
    }
}