plugins {
  id("android-feature")
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.drawables))
  implementation(project(Modules.listimport))
  implementation(project(Modules.strings))
  implementation(project(Modules.summary))
  implementation(project(Modules.ui))

  implementation("com.google.android.material:material:${Versions.material}")
  implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
  implementation("androidx.navigation:navigation-ui-ktx:2.3.5")
}