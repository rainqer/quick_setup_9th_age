package org.auspiciousrhino.quicksetup.navigation

import android.content.Context
import androidx.navigation.NavController
import org.auspiciousrhino.quicksetup.domain.ArmyList
import org.auspiciousrhino.quicksetup.domain.TerrainLayout

interface QuickSetupNavigation {

  fun previewTerrain(terrainLayout: TerrainLayout, context: Context)
  fun previewArmyList(armyList: ArmyList, navController: NavController)
  fun goToBattleOutcome(navController: NavController)
  fun popBackToBattleOutCome(navController: NavController)
}