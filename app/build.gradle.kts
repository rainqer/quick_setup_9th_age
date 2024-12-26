plugins {
  id("com.android.application")
  id("kotlin-android")
}

android {
  compileSdk = Versions.compileSdkVersion
  namespace = "org.auspiciousrhino.quicksetup.app"

  defaultConfig {
    minSdk = Versions.minSdkVersion
    versionCode = Versions.versionCode
    versionName = Versions.versionName
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
  }

  buildTypes {
    getByName("debug") {
      isMinifyEnabled = false
      isDebuggable = true
      isJniDebuggable = true
    }
    getByName("release") {
      isMinifyEnabled = true
      isDebuggable = false
    }
  }
  kotlin {
    jvmToolchain(21)
  }
}


dependencies {
  implementation(project(Modules.armyListPreview))
  implementation(project(Modules.battleoutcome))
  implementation(project(Modules.colors))
  implementation(project(Modules.domain))
  implementation(project(Modules.drawables))
  implementation(project(Modules.hostscreen))
  implementation(project(Modules.imagepreview))
  implementation(project(Modules.listimport))
  implementation(project(Modules.navigation))
  implementation(project(Modules.strings))
  implementation(project(Modules.storage))
  implementation(project(Modules.summary))
  implementation(project(Modules.ui))

  implementation(libs.kotlin)
  implementation(libs.kotlin.reflect)
  implementation(libs.material)

  implementation(libs.koin)
  implementation(libs.android.navigation.ui)
}