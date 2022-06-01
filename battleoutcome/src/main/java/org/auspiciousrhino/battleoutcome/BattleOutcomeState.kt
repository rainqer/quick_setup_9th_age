package org.auspiciousrhino.battleoutcome

import org.auspiciousrhino.domain.ArmyList

sealed class BattleOutcomeState {

  class Start(val armyList: ArmyList) : BattleOutcomeState()
  class Error() : BattleOutcomeState()
}