plugins {
    id("android-lib")
}

android {
    namespace = "org.auspiciousrhino.quicksetup.resources.drawables"
}

dependencies {
    implementation(project(Modules.colors))
}