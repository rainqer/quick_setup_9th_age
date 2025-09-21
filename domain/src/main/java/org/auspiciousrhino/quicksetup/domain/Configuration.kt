package org.auspiciousrhino.quicksetup.domain

data class Configuration(
  val map: TerrainLayout,
  val deployment: Deployment,
  val primaryObjective: Objective,
  val secondaryObjectives: List<Objective>,
)