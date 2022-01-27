plugins {
    id("android-lib")
    id("kotlin-android")
    id("androidx.navigation.safeargs")
}
dependencies {
    implementation(project(Modules.navigation))

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleKtxViewModel}")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleKtxLiveData}")
    implementation("androidx.activity:activity-ktx:${Versions.ktxActivities}")
    implementation("androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}")
}