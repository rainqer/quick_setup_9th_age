package org.auspiciousrhino.battleoutcome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.domain.ArmyList
import org.auspiciousrhino.navigation.NavigationEvent
import org.auspiciousrhino.storage.ArmyListRepository

class BattleOutcomeViewModel(
  private val armyListRepository: ArmyListRepository
) : ViewModel() {

  val state = MutableLiveData<BattleOutcomeState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun start() {
    val initialState = armyListRepository.armyList
      ?.let { BattleOutcomeState.Start(it) }
      ?: BattleOutcomeState.Error()
    state.postValue(initialState)
  }

  fun previewListClicked() {
    navigationEvents.postValue(NavigationEvent.PreviewList(ArmyList(emptyList())))
  }
}