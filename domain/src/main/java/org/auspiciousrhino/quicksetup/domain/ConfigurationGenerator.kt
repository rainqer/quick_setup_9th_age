package org.auspiciousrhino.quicksetup.domain

import org.auspiciousrhino.quicksetup.domain.definition.DEPLOYMENTS
import org.auspiciousrhino.quicksetup.domain.definition.SECONDARY_OBJECTIVES
import org.auspiciousrhino.quicksetup.domain.definition.TERRAIN_LAYOUTS

class ConfigurationGenerator {

  fun newConfiguration() = Configuration(
    TERRAIN_LAYOUTS.random(),
    DEPLOYMENTS.random(),
    SECONDARY_OBJECTIVES.random()
  )
}