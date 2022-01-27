plugins {
  id("android-lib")
}

dependencies {
  implementation(project(Modules.domain))

  implementation("com.google.code.gson:gson:${Versions.gson}")
  implementation("androidx.navigation:navigation-ui-ktx:${Versions.navigation}")
}
