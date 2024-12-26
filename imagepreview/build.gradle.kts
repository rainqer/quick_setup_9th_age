plugins {
  id("android-feature")
}

android {
  namespace = "org.auspiciousrhino.quicksetup.imagepreview"
}

dependencies {
  implementation(libs.photoView)
}