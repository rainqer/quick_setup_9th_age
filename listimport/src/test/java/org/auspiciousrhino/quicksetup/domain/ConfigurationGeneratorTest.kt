package org.auspiciousrhino.quicksetup.domain

import org.auspiciousrhino.quicksetup.resources.strings.R
import org.junit.Assert.*
import org.junit.Test

class ConfigurationGeneratorTest {

  @Test
  fun shouldRollForNewSetWithValidSecondaryObjectives() {
    // given
    val configurationGenerator = ConfigurationGenerator()

    (1..20).forEach { _ ->
      // when
      val newConfiguration = configurationGenerator.newConfiguration()

      // then
      val contains = arrayOf(
        R.string.secondaryobjective_01,
        R.string.secondaryobjective_02,
        R.string.secondaryobjective_09
      ).contains(newConfiguration.mySecondaryObjectives["OnG"]!!.name)
      assertTrue("secondary sets incorrect", contains)
    }
  }
}