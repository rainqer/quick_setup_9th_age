import org.gradle.accessors.dm.LibrariesForLibs

plugins {
  id("android-lib")
  id("kotlin-android")
  id("androidx.navigation.safeargs")
}
val libs = the<LibrariesForLibs>()

android {
  defaultConfig {
    minSdk = Versions.minSdkVersion
    compileSdk = Versions.compileSdkVersion
  }
}

dependencies {
  implementation(project(Modules.navigation))

  implementation(libs.lifecycle.viewmodel)
  implementation(libs.lifecycle.livedata)
  implementation(libs.androidx.activity)
  implementation(libs.androidx.constraintlayout)
  implementation(libs.androidx.recyclerview)
}