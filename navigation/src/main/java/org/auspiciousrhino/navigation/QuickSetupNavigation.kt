package org.auspiciousrhino.navigation

import android.content.Context
import androidx.navigation.NavController
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.domain.TerrainLayout

interface QuickSetupNavigation {

  fun previewTerrain(terrainLayout: TerrainLayout, context: Context)
  fun previewArmyList(armyList: ArmyList, navController: NavController)
  fun goToBattleOutcome(navController: NavController)
}