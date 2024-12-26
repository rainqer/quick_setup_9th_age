plugins {
  id("android-feature")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.battleoutcome"
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.navigation))
  implementation(project(Modules.storage))
  implementation(project(Modules.ui))
}