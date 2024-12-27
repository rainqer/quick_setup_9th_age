package org.auspiciousrhino.quicksetup.domain

import org.auspiciousrhino.quicksetup.domain.definition.DEPLOYMENT_06
import org.auspiciousrhino.quicksetup.domain.definition.SECONDARY_OBJECTIVE_1
import org.auspiciousrhino.quicksetup.domain.definition.TERRAIN_LAYOUT_01

class ConfigurationRepository {

  var configuration: Configuration = Configuration(
    map = TERRAIN_LAYOUT_01,
    primaryObjective = SECONDARY_OBJECTIVE_1,
    deployment = DEPLOYMENT_06,
    mySecondaryObjectives = emptyMap(),
    opponentSecondaryObjectives = emptyMap(),
  )
}