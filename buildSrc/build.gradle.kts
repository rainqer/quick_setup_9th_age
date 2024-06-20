repositories {
  mavenCentral()
  google()
}

plugins {
  `kotlin-dsl`
  `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
  implementation("com.android.tools.build:gradle:7.4.2")
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0")
  implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1")
}