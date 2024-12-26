plugins {
  id("android-feature")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.hostscreen"
}

dependencies {
  implementation(project(Modules.armyListPreview))
  implementation(project(Modules.battleoutcome))
  implementation(project(Modules.domain))
  implementation(project(Modules.drawables))
  implementation(project(Modules.listimport))
  implementation(project(Modules.strings))
  implementation(project(Modules.summary))
  implementation(project(Modules.ui))

  implementation(libs.material)
  implementation(libs.android.navigation.fragment)
  implementation(libs.android.navigation.ui)
}