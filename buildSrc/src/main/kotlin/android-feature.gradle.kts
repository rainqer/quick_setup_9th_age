plugins {
    id("android-lib")
    id("kotlin-android")
}
dependencies {
    implementation(project(Modules.navigation))

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleKtxViewModel}")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleKtxLiveData}")
    implementation("androidx.activity:activity-ktx:${Versions.ktxActivities}")
}