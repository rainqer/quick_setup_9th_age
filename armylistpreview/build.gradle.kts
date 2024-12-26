plugins {
  id("android-feature")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.armylistpreview"
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.ui))
  implementation(project(Modules.storage))
  implementation(project(Modules.strings))
  implementation(project(Modules.drawables))
}