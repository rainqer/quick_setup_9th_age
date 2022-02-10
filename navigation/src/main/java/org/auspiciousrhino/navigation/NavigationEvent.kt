package org.auspiciousrhino.navigation

import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.domain.TerrainLayout

sealed class NavigationEvent {

  class PreviewTerrain(val terrainLayout: TerrainLayout) : NavigationEvent()
  class PreviewList(val armyList: ArmyList) : NavigationEvent()
  class GoToBattleOutcome : NavigationEvent()
  class PopBackToBattleOutCome : NavigationEvent()
}