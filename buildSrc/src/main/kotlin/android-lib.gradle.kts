import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
}
val libs = the<LibrariesForLibs>()

android {
    defaultConfig {
        minSdk = Versions.minSdkVersion
        compileSdk = Versions.compileSdkVersion
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.kotlin.jdk8)
    implementation(libs.koin)
}