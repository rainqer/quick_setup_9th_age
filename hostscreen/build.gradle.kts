plugins {
  id("android-feature")
}

dependencies {
  implementation(project(Modules.armyListPreview))
  implementation(project(Modules.domain))
  implementation(project(Modules.drawables))
  implementation(project(Modules.listimport))
  implementation(project(Modules.strings))
  implementation(project(Modules.summary))
  implementation(project(Modules.ui))

  implementation("com.google.android.material:material:${Versions.material}")
  implementation("androidx.navigation:navigation-fragment-ktx:${Versions.navigation}")
  implementation("androidx.navigation:navigation-ui-ktx:${Versions.navigation}")
}