plugins {
  id("android-feature")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.listimport"
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.storage))
  implementation(project(Modules.ui))

  testImplementation(libs.test.junit)
}