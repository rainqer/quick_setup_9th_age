package org.auspiciousrhino.quicksetup.storage.di

import org.auspiciousrhino.quicksetup.storage.ArmyListRepository
import org.koin.dsl.module

val koinModule = module {

  single { ArmyListRepository(get()) }
}