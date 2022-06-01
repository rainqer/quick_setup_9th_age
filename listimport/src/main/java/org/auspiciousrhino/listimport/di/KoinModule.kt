package org.auspiciousrhino.listimport.di

import org.auspiciousrhino.listimport.ListImportViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { ListImportViewModel(get()) }
}