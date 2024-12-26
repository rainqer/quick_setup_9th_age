package org.auspiciousrhino.quicksetup.battleoutcome.di

import org.auspiciousrhino.quicksetup.battleoutcome.BattleOutcomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { BattleOutcomeViewModel(get()) }
}