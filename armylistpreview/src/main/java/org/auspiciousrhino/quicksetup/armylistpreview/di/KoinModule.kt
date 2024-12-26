package org.auspiciousrhino.quicksetup.armylistpreview.di

import org.auspiciousrhino.quicksetup.armylistpreview.ArmyListPreviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { ArmyListPreviewViewModel(get()) }
}