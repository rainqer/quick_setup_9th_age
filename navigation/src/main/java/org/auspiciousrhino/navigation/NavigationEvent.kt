package org.auspiciousrhino.navigation

import org.auspiciousrhino.domain.TerrainLayout

sealed class NavigationEvent {

  class PreviewTerrain(val terrainLayout: TerrainLayout) : NavigationEvent()
}