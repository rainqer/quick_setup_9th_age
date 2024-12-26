package org.auspiciousrhino.quicksetup.domain.definition

import org.auspiciousrhino.quicksetup.domain.Deployment
import org.auspiciousrhino.quicksetup.resources.drawables.R as Rdrawable
import org.auspiciousrhino.quicksetup.resources.strings.R as Rstrings

internal val DEPLOYMENT_01 = Deployment(
  name = Rstrings.string.deployment_01,
  image = Rdrawable.drawable.deployment_01_frontlineclash,
  description = Rstrings.string.deployment_01_description
)
internal val DEPLOYMENT_02 = Deployment(
  name = Rstrings.string.deployment_02,
  image = Rdrawable.drawable.deployment_02_dawn_assault,
  description = Rstrings.string.deployment_02_description
)
internal val DEPLOYMENT_03 = Deployment(
  name = Rstrings.string.deployment_03,
  image = Rdrawable.drawable.deployment_03_counterthrust,
  description = Rstrings.string.deployment_03_description
)
internal val DEPLOYMENT_04 = Deployment(
  name = Rstrings.string.deployment_04,
  image = Rdrawable.drawable.deployment_04_encircle,
  description = Rstrings.string.deployment_04_description
)
internal val DEPLOYMENT_05 = Deployment(
  name = Rstrings.string.deployment_05,
  image = Rdrawable.drawable.deployment_05_refused_flank,
  description = Rstrings.string.deployment_05_description
)
internal val DEPLOYMENT_06 = Deployment(
  name = Rstrings.string.deployment_06,
  image = Rdrawable.drawable.deployment_06_surging_tide,
  description = Rstrings.string.deployment_06_description
)

internal val DEPLOYMENTS = listOf(
  DEPLOYMENT_01,
  DEPLOYMENT_02,
  DEPLOYMENT_03,
  DEPLOYMENT_04,
  DEPLOYMENT_05,
  DEPLOYMENT_06,
)