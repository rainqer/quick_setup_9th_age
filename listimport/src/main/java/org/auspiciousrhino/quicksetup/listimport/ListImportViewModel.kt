package org.auspiciousrhino.quicksetup.listimport

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.quicksetup.navigation.NavigationEvent
import org.auspiciousrhino.quicksetup.storage.ArmyListRepository

class ListImportViewModel(
  private val armyListRepository: ArmyListRepository
) : ViewModel() {

  val state = MutableLiveData<ListImportState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun start() {
    if (armyListRepository.myArmyList != null) {
      navigationEvents.postValue(NavigationEvent.GoToBattleOutcome())
    }
  }

  fun importArmyList(rawArmyList: String) {
    val parsedArmyListState = parseArmyList(rawArmyList)
    storeArmyList(parsedArmyListState)
    state.postValue(parsedArmyListState)
    if (parsedArmyListState is ListImportState.Imported) {
      navigationEvents.postValue(NavigationEvent.GoToBattleOutcome())
    }
  }

  private fun storeArmyList(parsedArmyListState: ListImportState) {
    if (parsedArmyListState is ListImportState.Imported) {
      armyListRepository.myArmyList = parsedArmyListState.armyList
    }
  }

  private fun parseArmyList(rawArmyList: String): ListImportState {
    val armyList = ParsedList(rawArmyList).list
    return if (armyList.isEmpty) {
      ListImportState.Empty(rawArmyList)
    } else {
      ListImportState.Imported(armyList)
    }
  }
}