plugins {
  id("android-feature")
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.colors))

  implementation("com.google.android.material:material:${Versions.material}")
}