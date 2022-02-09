plugins {
  id("android-feature")
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.navigation))
  implementation(project(Modules.ui))
}