package org.auspiciousrhino.navigation

import android.view.View
import androidx.navigation.findNavController

class Navigation constructor(
  private val quickstartNavigation: QuickSetupNavigation
) : QuickSetupNavigation by quickstartNavigation {

  fun consume(navigationEvent: NavigationEvent, rootView: View) {
    when (navigationEvent) {
      is NavigationEvent.PreviewTerrain -> previewTerrain(navigationEvent.terrainLayout, rootView.context)
      is NavigationEvent.PreviewList -> previewArmyList(navigationEvent.armyList, rootView.findNavController())
    }
  }
}