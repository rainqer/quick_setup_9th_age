plugins {
  id("android-lib")
}

dependencies {
  implementation(project(Modules.drawables))
  implementation(project(Modules.strings))

  implementation("com.google.code.gson:gson:${Versions.gson}")
}
