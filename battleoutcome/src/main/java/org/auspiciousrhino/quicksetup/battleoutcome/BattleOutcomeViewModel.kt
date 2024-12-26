package org.auspiciousrhino.quicksetup.battleoutcome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.quicksetup.domain.ArmyList
import org.auspiciousrhino.quicksetup.navigation.NavigationEvent
import org.auspiciousrhino.quicksetup.storage.ArmyListRepository

class BattleOutcomeViewModel(
  private val armyListRepository: ArmyListRepository
) : ViewModel() {

  val state = MutableLiveData<BattleOutcomeState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun start() {
    val initialState = armyListRepository.myArmyList
      ?.let { BattleOutcomeState.Start(it) }
      ?: BattleOutcomeState.Error()
    state.postValue(initialState)
  }

  fun previewListClicked() {
    navigationEvents.postValue(NavigationEvent.PreviewList(ArmyList(emptyList())))
  }
}