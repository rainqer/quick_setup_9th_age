package org.auspiciousrhino.navigation

import android.content.Context

class Navigation constructor(
  private val quickstartNavigation: QuickSetupNavigation
) : QuickSetupNavigation by quickstartNavigation {

  fun consume(navigationEvent: NavigationEvent, context: Context) {
    when (navigationEvent) {
      is NavigationEvent.PreviewTerrain -> previewTerrain(navigationEvent.terrainLayout, context)
    }
  }
}