package org.auspiciousrhino.quicksetup.app

import android.content.Context
import androidx.navigation.NavController
import org.auspiciousrhino.quicksetup.armylistpreview.ArmyListPreviewFragmentDirections
import org.auspiciousrhino.quicksetup.battleoutcome.BattleOutcomeFragmentDirections
import org.auspiciousrhino.quicksetup.domain.ArmyList
import org.auspiciousrhino.quicksetup.domain.TerrainLayout
import org.auspiciousrhino.quicksetup.imagepreview.ImagePreviewActivity
import org.auspiciousrhino.quicksetup.listimport.ListImportFragmentDirections
import org.auspiciousrhino.quicksetup.navigation.QuickSetupNavigation

class QuickSetupAppNavigation : QuickSetupNavigation {

  override fun previewTerrain(terrainLayout: TerrainLayout, context: Context) {
    context.startActivity(ImagePreviewActivity.intent(context, terrainLayout.image))
  }

  override fun previewArmyList(armyList: ArmyList, navController: NavController) {
    navController.navigate(
      BattleOutcomeFragmentDirections.actionBattleOutcomeFragmentToArmyListPreviewFragment()
    )
  }

  override fun goToBattleOutcome(navController: NavController) {
    navController.navigate(
      ListImportFragmentDirections.actionListImportFragmentToBattleOutcomeFragment()
    )
  }

  override fun popBackToBattleOutCome(navController: NavController) {
    navController.navigate(
      ArmyListPreviewFragmentDirections.actionBattleOutcomeFragmentPopBack()
    )
  }
}