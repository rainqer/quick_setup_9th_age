plugins {
  id("android-feature")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.summary"
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.ui))
}