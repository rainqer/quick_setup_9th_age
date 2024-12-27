package org.auspiciousrhino.quicksetup.domain.definition

import org.auspiciousrhino.quicksetup.domain.TerrainLayout
import org.auspiciousrhino.quicksetup.resources.drawables.R as Rdrawable
import org.auspiciousrhino.quicksetup.resources.strings.R as Rstrings

internal val TERRAIN_LAYOUT_01 = TerrainLayout(
  name = Rstrings.string.terrainlayout_01,
  image = Rdrawable.drawable.terrain1
)
internal val TERRAIN_LAYOUT_02 = TerrainLayout(
  name = Rstrings.string.terrainlayout_02,
  image = Rdrawable.drawable.terrain2
)
internal val TERRAIN_LAYOUT_03 = TerrainLayout(
  name = Rstrings.string.terrainlayout_03,
  image = Rdrawable.drawable.terrain3
)
internal val TERRAIN_LAYOUT_04 = TerrainLayout(
  name = Rstrings.string.terrainlayout_04,
  image = Rdrawable.drawable.terrain4
)
internal val TERRAIN_LAYOUT_05 = TerrainLayout(
  name = Rstrings.string.terrainlayout_05,
  image = Rdrawable.drawable.terrain5
)
internal val TERRAIN_LAYOUT_06 = TerrainLayout(
  name = Rstrings.string.terrainlayout_06,
  image = Rdrawable.drawable.terrain6
)

internal val TERRAIN_LAYOUTS = listOf(
  TERRAIN_LAYOUT_01,
  TERRAIN_LAYOUT_02,
  TERRAIN_LAYOUT_03,
  TERRAIN_LAYOUT_04,
  TERRAIN_LAYOUT_05,
  TERRAIN_LAYOUT_06,
)