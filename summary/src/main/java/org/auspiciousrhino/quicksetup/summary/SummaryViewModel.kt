package org.auspiciousrhino.quicksetup.summary

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.auspiciousrhino.quicksetup.domain.ConfigurationGenerator
import org.auspiciousrhino.quicksetup.domain.ConfigurationRepository
import org.auspiciousrhino.quicksetup.navigation.NavigationEvent

class SummaryViewModel(
  private val configurationRepository: ConfigurationRepository,
  private val configurationGenerator: ConfigurationGenerator
) : ViewModel() {

  val state = MutableLiveData<SummaryState>()
  val navigationEvents = MutableLiveData<NavigationEvent>()

  fun init() {
    generateNewConfiguration()
  }

  fun onTerrainLayoutEnlargeClicked() {
    state.value?.configuration?.map?.let { terrainLayout -> navigationEvents.postValue(NavigationEvent.PreviewTerrain(terrainLayout)) }
  }

  fun generateNewConfiguration() {
    configurationRepository.configuration = configurationGenerator.newConfiguration()
    state.postValue(SummaryState(configurationRepository.configuration))
  }
}