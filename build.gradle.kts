buildscript {


  repositories {
    mavenCentral()
    google()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:7.4.2")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
    classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}")
  }
}

allprojects {
  repositories {
    mavenCentral()
    google()
  }
}
