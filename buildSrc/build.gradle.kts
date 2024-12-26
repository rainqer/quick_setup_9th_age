repositories {
  mavenCentral()
  google()
}

plugins {
  `kotlin-dsl`
  `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
  implementation(libs.gradle)
  implementation(libs.gradle.plugin)
  implementation(libs.kotlin.jdk8)
  implementation(libs.android.navigation.safeArgs)
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}