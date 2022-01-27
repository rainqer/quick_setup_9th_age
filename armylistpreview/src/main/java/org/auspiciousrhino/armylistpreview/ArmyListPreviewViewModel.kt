package org.auspiciousrhino.armylistpreview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.navigation.NavigationEvent

class ArmyListPreviewViewModel() : ViewModel() {

  val state = MutableLiveData<ArmyListPreviewState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun start(armyId: String) {

  }
}