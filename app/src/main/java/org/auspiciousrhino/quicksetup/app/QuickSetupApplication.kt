package org.auspiciousrhino.quicksetup.app

import android.app.Application
import org.auspiciousrhino.quicksetup.app.di.appModule
import org.auspiciousrhino.quicksetup.armylistpreview.di.koinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class QuickSetupApplication : Application() {

  override fun onCreate() {
    super.onCreate()
    startKoin {
      androidContext(this@QuickSetupApplication)
      modules(
        appModule,
        koinModule,
        org.auspiciousrhino.quicksetup.battleoutcome.di.koinModule,
        org.auspiciousrhino.quicksetup.domain.di.koinModule,
        org.auspiciousrhino.quicksetup.listimport.di.koinModule,
        org.auspiciousrhino.quicksetup.storage.di.koinModule,
        org.auspiciousrhino.quicksetup.summary.di.koinModule,
      )
    }
  }
}