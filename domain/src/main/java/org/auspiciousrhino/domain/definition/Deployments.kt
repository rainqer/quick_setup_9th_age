package org.auspiciousrhino.domain.definition

import org.auspiciousrhino.domain.Deployment
import org.auspiciousrhino.domain.R

internal val DEPLOYMENT_01 = Deployment(
  name = R.string.deployment_01,
  image = R.drawable.deployment_01_frontlineclash,
  description = R.string.deployment_01_description
)
internal val DEPLOYMENT_02 = Deployment(
  name = R.string.deployment_02,
  image = R.drawable.deployment_02_dawn_assault,
  description = R.string.deployment_02_description
)
internal val DEPLOYMENT_03 = Deployment(
  name = R.string.deployment_03,
  image = R.drawable.deployment_03_counterthrust,
  description = R.string.deployment_03_description
)
internal val DEPLOYMENT_04 = Deployment(
  name = R.string.deployment_04,
  image = R.drawable.deployment_04_encircle,
  description = R.string.deployment_04_description
)
internal val DEPLOYMENT_05 = Deployment(
  name = R.string.deployment_05,
  image = R.drawable.deployment_05_refused_flank,
  description = R.string.deployment_05_description
)
internal val DEPLOYMENT_06 = Deployment(
  name = R.string.deployment_06,
  image = R.drawable.deployment_06_marching_columns,
  description = R.string.deployment_06_description
)

internal val DEPLOYMENTS = listOf(
  DEPLOYMENT_01,
  DEPLOYMENT_02,
  DEPLOYMENT_03,
  DEPLOYMENT_04,
  DEPLOYMENT_05,
  DEPLOYMENT_06,
)