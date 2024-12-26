package org.auspiciousrhino.quicksetup.summary.di

import org.auspiciousrhino.quicksetup.summary.SummaryViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { SummaryViewModel(get(), get()) }
}