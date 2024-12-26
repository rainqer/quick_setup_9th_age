plugins {
  id("android-lib")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.storage"
}

dependencies {
  implementation(project(Modules.domain))
  implementation(libs.gson)
}
