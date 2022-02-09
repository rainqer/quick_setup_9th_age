package org.auspiciousrhino.listimport

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.navigation.NavigationEvent

class ListImportViewModel(
) : ViewModel() {

  val state = MutableLiveData<ListImportState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun importArmyList(rawArmyList: String) {
    val parseArmyListState = parseArmyList(rawArmyList)
    state.postValue(parseArmyListState)
    if (parseArmyListState is ListImportState.Imported) {
      navigationEvents.postValue(NavigationEvent.GoToBattleOutcome())
    }
  }

  private fun parseArmyList(rawArmyList: String): ListImportState {
    val armyList = ParsedList(rawArmyList).list
    return if (armyList.isEmpty) ListImportState.Empty(rawArmyList) else ListImportState.Imported(armyList)
  }
}