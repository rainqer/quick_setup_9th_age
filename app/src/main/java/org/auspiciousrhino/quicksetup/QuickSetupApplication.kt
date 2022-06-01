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
        org.auspiciousrhino.armylistpreview.di.koinModule,
        org.auspiciousrhino.battleoutcome.di.koinModule,
        org.auspiciousrhino.domain.di.koinModule,
        org.auspiciousrhino.listimport.di.koinModule,
        org.auspiciousrhino.storage.di.koinModule,
        org.auspiciousrhino.summary.di.koinModule,
      )
    }
  }
}