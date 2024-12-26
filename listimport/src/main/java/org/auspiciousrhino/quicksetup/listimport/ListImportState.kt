package org.auspiciousrhino.quicksetup.listimport

import org.auspiciousrhino.quicksetup.domain.ArmyList

sealed class ListImportState(val shouldProceed: Boolean) {

  class Start : ListImportState(shouldProceed = false)
  class Empty(val rawArmyList: String) : ListImportState(shouldProceed = false)
  class Imported(val armyList: ArmyList) : ListImportState(shouldProceed = true)
}