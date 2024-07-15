plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlinAndroidKsp)
    alias(libs.plugins.hiltAndroid)
    alias(libs.plugins.kotlin.parcelize)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.productsapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.productsapplication"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.play.services.analytics.impl)
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(libs.androidx.databinding.runtime)
    implementation("androidx.fragment:fragment-ktx:1.8.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofitGson)

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    // RecyclerView
    implementation(libs.recyclerview)

    // Coroutine
    implementation(libs.coroutinesCore)
    implementation(libs.coroutinesAndroid)

    // Unit Testing
    testImplementation(libs.junit)
    testImplementation(libs.mockitoCore)
    testImplementation(libs.coroutinesTest)

    // Glide for image loading
    implementation(libs.glide)
    ksp(libs.glideCompiler)
    implementation ("com.squareup.picasso:picasso:2.8")

    implementation ("com.facebook.shimmer:shimmer:0.5.0")

    implementation ("com.makeramen:roundedimageview:2.3.0")

    // ViewModel and LiveData
    implementation(libs.lifecycleViewModel)
    implementation(libs.lifecycleLiveData)
}