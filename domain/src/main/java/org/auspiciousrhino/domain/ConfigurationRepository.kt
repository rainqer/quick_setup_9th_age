package org.auspiciousrhino.domain

import org.auspiciousrhino.domain.definition.DEPLOYMENT_06
import org.auspiciousrhino.domain.definition.SECONDARY_OBJECTIVE_1
import org.auspiciousrhino.domain.definition.TERRAIN_LAYOUT_01

class ConfigurationRepository {

  var configuration: Configuration = Configuration(
    map = TERRAIN_LAYOUT_01,
    secondaryObjective = SECONDARY_OBJECTIVE_1,
    deployment = DEPLOYMENT_06
  )
}