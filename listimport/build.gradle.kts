plugins {
  id("android-feature")
}

dependencies {
  implementation(project(Modules.domain))
  implementation(project(Modules.storage))
  implementation(project(Modules.ui))
  testImplementation("junit:junit:4.13")
}