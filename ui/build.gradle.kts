plugins {
  id("android-feature")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.ui"
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.colors))
  implementation(project(Modules.strings))

  implementation(libs.material)
}