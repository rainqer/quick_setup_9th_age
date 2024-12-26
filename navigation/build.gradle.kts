plugins {
  id("android-lib")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.navigation"
}

dependencies {
  implementation(project(Modules.domain))

  implementation(libs.android.navigation.ui)
  implementation(libs.gson)
}
