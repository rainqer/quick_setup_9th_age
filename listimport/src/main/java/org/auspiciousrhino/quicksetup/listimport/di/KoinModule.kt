package org.auspiciousrhino.quicksetup.listimport.di

import org.auspiciousrhino.quicksetup.listimport.ListImportViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel { ListImportViewModel(get()) }
}