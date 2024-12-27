package org.auspiciousrhino.quicksetup.domain.definition

import org.auspiciousrhino.quicksetup.domain.Objective
import org.auspiciousrhino.quicksetup.resources.strings.R

internal val SECONDARY_OBJECTIVE_1 = Objective(
  name = R.string.secondaryobjective_01,
  descriptionShort = R.string.secondaryobjective_01_description_short,
  description = R.string.secondaryobjective_01_description
)
internal val SECONDARY_OBJECTIVE_2 = Objective(
  name = R.string.secondaryobjective_02,
  descriptionShort = R.string.secondaryobjective_02_description_short,
  description = R.string.secondaryobjective_02_description
)

val SECONDARY_OBJECTIVES = listOf(
  SECONDARY_OBJECTIVE_1,
  SECONDARY_OBJECTIVE_2,
)