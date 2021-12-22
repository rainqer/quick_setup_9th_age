package org.auspiciousrhino.summary.di

import org.auspiciousrhino.summary.SummaryViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { SummaryViewModel(get(), get()) }
}