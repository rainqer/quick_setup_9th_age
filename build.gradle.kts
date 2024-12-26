buildscript {


  repositories {
    mavenCentral()
    google()
  }
  dependencies {
    classpath(libs.gradle)
    classpath(libs.kotlin.gradle.plugin)
    classpath(libs.android.navigation.safeArgs)
  }
}

allprojects {
  repositories {
    mavenCentral()
    google()
  }
}
