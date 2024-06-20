plugins {
  id("com.android.application")
  id("kotlin-android")
}

android {
  compileSdk = Versions.compileSdkVersion
  buildToolsVersion = Versions.buildTools

  defaultConfig {
    minSdkVersion(Versions.minSdkVersion)
    targetSdkVersion(Versions.targetSdkVersion)
    versionCode = Versions.versionCode
    versionName = Versions.versionName
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
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

  kotlinOptions {
    jvmTarget = "1.8"
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

  implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
  implementation("org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}")
  implementation("com.google.android.material:material:${Versions.material}")

  implementation("io.insert-koin:koin-android:${Versions.koin}")
  implementation("androidx.navigation:navigation-ui-ktx:${Versions.navigation}")
}