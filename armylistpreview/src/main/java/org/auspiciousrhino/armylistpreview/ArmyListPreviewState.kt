package org.auspiciousrhino.armylistpreview

import org.auspiciousrhino.domain.ArmyList

sealed class ArmyListPreviewState {

  class Start(val armyList: ArmyList) : ArmyListPreviewState()
}