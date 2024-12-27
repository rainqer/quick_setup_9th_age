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
internal val SECONDARY_OBJECTIVE_3 = Objective(
  name = R.string.secondaryobjective_03,
  descriptionShort = R.string.secondaryobjective_03_description_short,
  description = R.string.secondaryobjective_03_description
)
internal val SECONDARY_OBJECTIVE_4 = Objective(
  name = R.string.secondaryobjective_04,
  descriptionShort = R.string.secondaryobjective_04_description_short,
  description = R.string.secondaryobjective_04_description
)
internal val SECONDARY_OBJECTIVE_5 = Objective(
  name = R.string.secondaryobjective_05,
  descriptionShort = R.string.secondaryobjective_05_description_short,
  description = R.string.secondaryobjective_05_description
)
internal val SECONDARY_OBJECTIVE_6 = Objective(
  name = R.string.secondaryobjective_06,
  descriptionShort = R.string.secondaryobjective_06_description_short,
  description = R.string.secondaryobjective_06_description
)
internal val SECONDARY_OBJECTIVE_7 = Objective(
  name = R.string.secondaryobjective_07,
  descriptionShort = R.string.secondaryobjective_07_description_short,
  description = R.string.secondaryobjective_07_description
)
internal val SECONDARY_OBJECTIVE_8 = Objective(
  name = R.string.secondaryobjective_08,
  descriptionShort = R.string.secondaryobjective_08_description_short,
  description = R.string.secondaryobjective_08_description
)
internal val SECONDARY_OBJECTIVE_9 = Objective(
  name = R.string.secondaryobjective_09,
  descriptionShort = R.string.secondaryobjective_09_description_short,
  description = R.string.secondaryobjective_09_description
)
internal val SECONDARY_OBJECTIVE_10 = Objective(
  name = R.string.secondaryobjective_10,
  descriptionShort = R.string.secondaryobjective_10_description_short,
  description = R.string.secondaryobjective_10_description
)
internal val SECONDARY_OBJECTIVE_11 = Objective(
  name = R.string.secondaryobjective_11,
  descriptionShort = R.string.secondaryobjective_11_description_short,
  description = R.string.secondaryobjective_11_description
)
internal val SECONDARY_OBJECTIVE_12 = Objective(
  name = R.string.secondaryobjective_12,
  descriptionShort = R.string.secondaryobjective_12_description_short,
  description = R.string.secondaryobjective_12_description
)

val ARMY_OBJECTIVES_BEAST_HERDS = listOf(
  SECONDARY_OBJECTIVE_1,
  SECONDARY_OBJECTIVE_2,
  SECONDARY_OBJECTIVE_5,
)

val ARMY_OBJECTIVES_DREAD_ELVES = listOf(
  SECONDARY_OBJECTIVE_1,
  SECONDARY_OBJECTIVE_3,
  SECONDARY_OBJECTIVE_4,
)

val ARMY_OBJECTIVES_DWARVEN_HOLDS = listOf(
  SECONDARY_OBJECTIVE_8,
  SECONDARY_OBJECTIVE_10,
  SECONDARY_OBJECTIVE_11,
)

val ARMY_OBJECTIVES_DAEMON_LEGIONS = listOf(
  SECONDARY_OBJECTIVE_1,
  SECONDARY_OBJECTIVE_6,
  SECONDARY_OBJECTIVE_7,
)

val ARMY_OBJECTIVES_EMPRIRE = listOf(
  SECONDARY_OBJECTIVE_10,
  SECONDARY_OBJECTIVE_11,
  SECONDARY_OBJECTIVE_12,
)

val ARMY_OBJECTIVES_HIGHBORN_ELVES = listOf(
  SECONDARY_OBJECTIVE_3,
  SECONDARY_OBJECTIVE_6,
  SECONDARY_OBJECTIVE_10,
)

val ARMY_OBJECTIVES_KINGDOM = listOf(
  SECONDARY_OBJECTIVE_5,
  SECONDARY_OBJECTIVE_7,
  SECONDARY_OBJECTIVE_9,
)

val ARMY_OBJECTIVES_INFERNAL_DWARFS = listOf(
  SECONDARY_OBJECTIVE_4,
  SECONDARY_OBJECTIVE_8,
  SECONDARY_OBJECTIVE_11,
)

val ARMY_OBJECTIVES_OGRE = listOf(
  SECONDARY_OBJECTIVE_2,
  SECONDARY_OBJECTIVE_4,
  SECONDARY_OBJECTIVE_9,
)

val ARMY_OBJECTIVES_ORCS = listOf(
  SECONDARY_OBJECTIVE_1,
  SECONDARY_OBJECTIVE_2,
  SECONDARY_OBJECTIVE_9,
)

val ARMY_OBJECTIVES_SAURIAN = listOf(
  SECONDARY_OBJECTIVE_5,
  SECONDARY_OBJECTIVE_10,
  SECONDARY_OBJECTIVE_12,
)

val ARMY_OBJECTIVES_SYLVAN = listOf(
  SECONDARY_OBJECTIVE_5,
  SECONDARY_OBJECTIVE_7,
  SECONDARY_OBJECTIVE_8,
)

val ARMY_OBJECTIVES_UNDYING = listOf(
  SECONDARY_OBJECTIVE_6,
  SECONDARY_OBJECTIVE_7,
  SECONDARY_OBJECTIVE_12,
)

val ARMY_OBJECTIVES_VAMPIRE = listOf(
  SECONDARY_OBJECTIVE_3,
  SECONDARY_OBJECTIVE_6,
  SECONDARY_OBJECTIVE_8,
)

val ARMY_OBJECTIVES_VERMIN = listOf(
  SECONDARY_OBJECTIVE_4,
  SECONDARY_OBJECTIVE_11,
  SECONDARY_OBJECTIVE_12,
)

val ARMY_OBJECTIVES_WARRIORS = listOf(
  SECONDARY_OBJECTIVE_2,
  SECONDARY_OBJECTIVE_3,
  SECONDARY_OBJECTIVE_9,
)

val ARMY_OBJECTIVES = listOf(
  "BH" to ARMY_OBJECTIVES_BEAST_HERDS,
  "DE" to ARMY_OBJECTIVES_DREAD_ELVES,
  "DH" to ARMY_OBJECTIVES_DWARVEN_HOLDS,
  "DL" to ARMY_OBJECTIVES_DAEMON_LEGIONS,
  "EoS" to ARMY_OBJECTIVES_EMPRIRE,
  "HE" to ARMY_OBJECTIVES_HIGHBORN_ELVES,
  "KoE" to ARMY_OBJECTIVES_KINGDOM,
  "ID" to ARMY_OBJECTIVES_INFERNAL_DWARFS,
  "OK" to ARMY_OBJECTIVES_OGRE,
  "OnG" to ARMY_OBJECTIVES_ORCS,
  "SA" to ARMY_OBJECTIVES_SAURIAN,
  "SE" to ARMY_OBJECTIVES_SYLVAN,
  "UD" to ARMY_OBJECTIVES_UNDYING,
  "VC" to ARMY_OBJECTIVES_VAMPIRE,
  "VS" to ARMY_OBJECTIVES_VERMIN,
  "WDG" to ARMY_OBJECTIVES_WARRIORS
)

val ARMY_OBJECTIVES_ORDERED: Array<Map<String, Objective>> =
  arrayOf(
    armyObjectivesOfIndex(0),
    armyObjectivesOfIndex(1),
    armyObjectivesOfIndex(2),
  )

private fun armyObjectivesOfIndex(index: Int) = ARMY_OBJECTIVES.map { it.first to it.second[index] }.toMap()
