package org.auspiciousrhino.domain

import org.auspiciousrhino.domain.definition.DEPLOYMENTS
import org.auspiciousrhino.domain.definition.SECONDARY_OBJECTIVES
import org.auspiciousrhino.domain.definition.TERRAIN_LAYOUTS

class ConfigurationGenerator {

  fun newConfiguration() = Configuration(
    TERRAIN_LAYOUTS.random(),
    DEPLOYMENTS.random(),
    SECONDARY_OBJECTIVES.random()
  )
}