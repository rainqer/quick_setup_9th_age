package org.auspiciousrhino.quicksetup.domain

import org.auspiciousrhino.quicksetup.domain.definition.DEPLOYMENTS
import org.auspiciousrhino.quicksetup.domain.definition.PRIMARY_OBJECTIVES
import org.auspiciousrhino.quicksetup.domain.definition.SECONDARY_OBJECTIVE_1
import org.auspiciousrhino.quicksetup.domain.definition.TERRAIN_LAYOUTS

class ConfigurationGenerator {

  fun newConfiguration() = Configuration(
    TERRAIN_LAYOUTS.random(),
    DEPLOYMENTS.random(),
    PRIMARY_OBJECTIVES.random(),
    mySecondaryObjectives = mapOf("Vermin Swarm" to SECONDARY_OBJECTIVE_1)
  )
}