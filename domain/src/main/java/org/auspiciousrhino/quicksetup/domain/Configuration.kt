package org.auspiciousrhino.quicksetup.domain

data class Configuration(
  val map: TerrainLayout,
  val deployment: Deployment,
  val primaryObjective: Objective,
  val mySecondaryObjectives: Map<String, Objective>,
  val opponentSecondaryObjectives: Map<String, Objective>
)