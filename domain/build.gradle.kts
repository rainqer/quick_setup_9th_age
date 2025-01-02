plugins {
  id("android-lib")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.domain"
}

dependencies {
  implementation(project(Modules.drawables))
  implementation(project(Modules.strings))

  implementation(libs.gson)
  testImplementation(libs.test.junit)
}
