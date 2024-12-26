package org.auspiciousrhino.quicksetup.battleoutcome

import org.auspiciousrhino.quicksetup.domain.ArmyList

sealed class BattleOutcomeState {

  class Start(val armyList: ArmyList) : BattleOutcomeState()
  class Error() : BattleOutcomeState()
}