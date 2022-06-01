package org.auspiciousrhino.armylistpreview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.navigation.NavigationEvent
import org.auspiciousrhino.storage.ArmyListRepository

class ArmyListPreviewViewModel(
  private val armyListRepository: ArmyListRepository
) : ViewModel() {

  val state = MutableLiveData<ArmyListPreviewState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun start() {
    val myArmyList = armyListRepository.myArmyList ?: return
    state.postValue(ArmyListPreviewState.Start(myArmyList))
  }

  fun onOkPressed() {
    navigationEvents.postValue(NavigationEvent.PopBackToBattleOutCome())
  }
}