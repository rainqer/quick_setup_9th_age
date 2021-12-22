package org.auspiciousrhino.quicksetup

import android.content.Context
import org.auspiciousrhino.domain.TerrainLayout
import org.auspiciousrhino.imagepreview.ImagePreviewActivity
import org.auspiciousrhino.navigation.QuickSetupNavigation

class QuickSetupAppNavigation : QuickSetupNavigation {

  override fun previewTerrain(terrainLayout: TerrainLayout, context: Context) {
    context.startActivity(ImagePreviewActivity.intent(context, terrainLayout.image))
  }
}