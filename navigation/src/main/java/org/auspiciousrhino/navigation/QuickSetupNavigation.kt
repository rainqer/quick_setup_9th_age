package org.auspiciousrhino.navigation

import android.content.Context
import org.auspiciousrhino.domain.TerrainLayout

interface QuickSetupNavigation {

  fun previewTerrain(terrainLayout: TerrainLayout, context: Context)
}