package org.auspiciousrhino.quicksetup.di

import org.auspiciousrhino.navigation.Navigation
import org.auspiciousrhino.navigation.QuickSetupNavigation
import org.auspiciousrhino.quicksetup.QuickSetupAppNavigation
import org.koin.dsl.module

val appModule = module {

  single { Navigation(get()) }

  single<QuickSetupNavigation> { QuickSetupAppNavigation() }
}