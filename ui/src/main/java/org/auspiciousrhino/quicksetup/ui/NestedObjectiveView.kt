package org.auspiciousrhino.quicksetup.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.google.android.material.tabs.TabLayout
import org.auspiciousrhino.quicksetup.domain.Objective

class NestedObjectiveView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

  private val mySecondaryObjectiveView
    get() = findViewById<ObjectiveView>(R.id.mySecondaryObjectiveNestedView)

  private val mySecondaryObjectiveForArmyTabs
    get() = findViewById<TabLayout>(R.id.mySecondaryObjectiveForArmyTabs)

  init {
    inflate(context, R.layout.view_nested_objective, this)
    orientation = VERTICAL
  }

  var verbose: Boolean = false
    set(value) {
      field = value
      mySecondaryObjectiveView.verbose = verbose
    }

  var viewEntity: Map<String, Objective> = emptyMap()
    set(value) {
      field = value
      val selectedTabPosition = mySecondaryObjectiveForArmyTabs.selectedTabPosition.takeIf { it > 0 } ?: 0
      mySecondaryObjectiveView.viewEntity = value[value.keys.toTypedArray()[selectedTabPosition]]
      if (mySecondaryObjectiveForArmyTabs.tabCount == 0) {
        configureTabs(value)
      }
      mySecondaryObjectiveForArmyTabs.clearOnTabSelectedListeners()
      mySecondaryObjectiveForArmyTabs.addOnTabSelectedListener(OnObjectiveForArmySelectedTabListener(value, mySecondaryObjectiveView))
    }

  private fun configureTabs(value: Map<String, Objective>) {
    value.keys
      .map { mySecondaryObjectiveForArmyTabs.newTab().setText(it) }
      .forEach { mySecondaryObjectiveForArmyTabs.addTab(it) }
  }
}