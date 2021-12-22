package org.auspiciousrhino.domain.di

import org.auspiciousrhino.domain.ConfigurationGenerator
import org.auspiciousrhino.domain.ConfigurationRepository
import org.koin.dsl.module

val koinModule = module {

  single { ConfigurationRepository() }

  single { ConfigurationGenerator() }
}