package org.auspiciousrhino.summary

import android.os.Bundle
import androidx.activity.ComponentActivity
import org.auspiciousrhino.navigation.Navigation
import org.auspiciousrhino.summary.databinding.ActivitySummaryBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class SummaryActivity : ComponentActivity() {

  private lateinit var binding: ActivitySummaryBinding
  private val navigation: Navigation by inject()
  private val model: SummaryViewModel by viewModel()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySummaryBinding.inflate(layoutInflater)
    setContentView(binding.root)
    model.state.observe(this) { summaryState ->
      binding.terrainLayout.viewEntity = summaryState.configuration.map
      binding.deployment.viewEntity = summaryState.configuration.deployment
      binding.secondaryObjective.viewEntity = summaryState.configuration.secondaryObjective
    }
    model.navigationEvents.observe(this) { navigationEvent ->
      navigation.consume(navigationEvent, this)
    }
    model.init()
    binding.enlargeTerrain.setOnClickListener { model.onTerrainLayoutEnlargeClicked() }
    binding.terrainLayout.setOnClickListener { model.onTerrainLayoutEnlargeClicked() }
    binding.deploymentDetailsButton.setOnClickListener { binding.deployment.verbose = !binding.deployment.verbose }
    binding.secondaryObjectiveDetailsButton.setOnClickListener { binding.secondaryObjective.verbose = !binding.secondaryObjective.verbose }
    binding.generateNewConfigurationButton.setOnClickListener { model.generateNewConfiguration() }
  }
}
