package org.auspiciousrhino.quicksetup.navigation

import org.auspiciousrhino.quicksetup.domain.ArmyList
import org.auspiciousrhino.quicksetup.domain.TerrainLayout

sealed class NavigationEvent {

  class PreviewTerrain(val terrainLayout: TerrainLayout) : NavigationEvent()
  class PreviewList(val armyList: ArmyList) : NavigationEvent()
  class GoToBattleOutcome : NavigationEvent()
  class PopBackToBattleOutCome : NavigationEvent()
}