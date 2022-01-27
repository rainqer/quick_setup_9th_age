package org.auspiciousrhino.quicksetup

import android.content.Context
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.domain.TerrainLayout
import org.auspiciousrhino.imagepreview.ImagePreviewActivity
import org.auspiciousrhino.listimport.ListImportFragmentDirections
import org.auspiciousrhino.navigation.QuickSetupNavigation

class QuickSetupAppNavigation : QuickSetupNavigation {

  override fun previewTerrain(terrainLayout: TerrainLayout, context: Context) {
    context.startActivity(ImagePreviewActivity.intent(context, terrainLayout.image))
  }

  override fun previewArmyList(armyList: ArmyList, navController: NavController) {
    navController.navigate(
      ListImportFragmentDirections.actionListImportFragmentToArmyListPreviewFragment()
    )
  }
}