buildscript {


  repositories {
    mavenCentral()
    google()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:4.2.2")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
  }
}

allprojects {
  repositories {
    mavenCentral()
    google()
  }
}