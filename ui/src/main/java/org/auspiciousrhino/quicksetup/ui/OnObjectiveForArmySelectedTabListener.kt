package org.auspiciousrhino.quicksetup.ui

import com.google.android.material.tabs.TabLayout
import org.auspiciousrhino.quicksetup.domain.Objective

class OnObjectiveForArmySelectedTabListener(
  private val objectivesForArmies: Map<String, Objective>,
  private val mySecondaryObjectiveView: ObjectiveView
) : TabLayout.OnTabSelectedListener {

  override fun onTabSelected(tab: TabLayout.Tab) {
    mySecondaryObjectiveView.viewEntity = objectivesForArmies[tab.text]
  }

  override fun onTabUnselected(tab: TabLayout.Tab?) {
    // NO-OP
  }

  override fun onTabReselected(tab: TabLayout.Tab?) {
    // NO-OP
  }
}