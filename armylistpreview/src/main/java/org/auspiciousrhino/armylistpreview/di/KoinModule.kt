package org.auspiciousrhino.armylistpreview.di

import org.auspiciousrhino.armylistpreview.ArmyListPreviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { ArmyListPreviewViewModel(get()) }
}