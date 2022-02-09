package org.auspiciousrhino.battleoutcome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.navigation.NavigationEvent

class BattleOutcomeViewModel() : ViewModel() {

  val state = MutableLiveData<BattleOutcomeState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun start() {

  }

  fun previewListClicked() {
    navigationEvents.postValue(NavigationEvent.PreviewList(ArmyList(emptyList())))
  }
}