package org.auspiciousrhino.battleoutcome.di

import org.auspiciousrhino.battleoutcome.BattleOutcomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { BattleOutcomeViewModel() }
}