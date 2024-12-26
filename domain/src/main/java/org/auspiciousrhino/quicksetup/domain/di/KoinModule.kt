package org.auspiciousrhino.quicksetup.domain.di

import org.auspiciousrhino.quicksetup.domain.ConfigurationGenerator
import org.auspiciousrhino.quicksetup.domain.ConfigurationRepository
import org.koin.dsl.module

val koinModule = module {

  single { ConfigurationRepository() }

  single { ConfigurationGenerator() }
}