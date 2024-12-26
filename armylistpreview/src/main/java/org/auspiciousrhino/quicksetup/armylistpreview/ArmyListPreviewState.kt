package org.auspiciousrhino.quicksetup.armylistpreview

import org.auspiciousrhino.quicksetup.domain.ArmyList

sealed class ArmyListPreviewState {

  class Start(val armyList: ArmyList) : ArmyListPreviewState()
}