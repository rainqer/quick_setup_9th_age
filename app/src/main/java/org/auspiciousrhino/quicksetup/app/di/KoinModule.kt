package org.auspiciousrhino.quicksetup.app.di

import org.auspiciousrhino.quicksetup.navigation.Navigation
import org.auspiciousrhino.quicksetup.navigation.QuickSetupNavigation
import org.auspiciousrhino.quicksetup.app.QuickSetupAppNavigation
import org.koin.dsl.module

val appModule = module {

  single { Navigation(get()) }

  single<QuickSetupNavigation> { QuickSetupAppNavigation() }
}