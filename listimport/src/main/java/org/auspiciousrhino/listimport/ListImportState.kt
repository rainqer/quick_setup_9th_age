package org.auspiciousrhino.listimport

import org.auspiciousrhino.domain.ArmyList

sealed class ListImportState {

  class Start() : ListImportState()
  class Empty() : ListImportState()
  class Imported(val armyList: ArmyList) : ListImportState()
}