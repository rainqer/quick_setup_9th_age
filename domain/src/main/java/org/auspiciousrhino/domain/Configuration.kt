package org.auspiciousrhino.domain

data class Configuration(
  val map: TerrainLayout,
  val deployment: Deployment,
  val secondaryObjective: SecondaryObjective
)