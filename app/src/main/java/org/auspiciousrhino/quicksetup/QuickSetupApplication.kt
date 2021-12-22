package org.auspiciousrhino.quicksetup

import android.app.Application
import org.auspiciousrhino.quicksetup.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class QuickSetupApplication : Application() {

  override fun onCreate() {
    super.onCreate()
    startKoin {
      androidContext(this@QuickSetupApplication)
      modules(
        appModule,
        org.auspiciousrhino.summary.di.koinModule,
        org.auspiciousrhino.domain.di.koinModule,
      )
    }
  }
}