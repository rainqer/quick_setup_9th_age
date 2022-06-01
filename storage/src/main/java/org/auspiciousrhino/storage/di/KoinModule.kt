package org.auspiciousrhino.storage.di

import org.auspiciousrhino.storage.ArmyListRepository
import org.koin.dsl.module

val koinModule = module {

  single { ArmyListRepository(get()) }
}