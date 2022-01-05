plugins {
    id("com.android.application")
    id("kotlin-android")
    id("org.jetbrains.gradle.plugin.idea-ext")
}

android {
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(Deps.androidx.corektx)
    implementation(Deps.androidx.appcompat)
    implementation(Deps.androidx.material)
    testImplementation(Deps.junit.core)
    androidTestImplementation(Deps.junit.android)
    androidTestImplementation(Deps.espresso)
}

idea {
    module {
        (this as ExtensionAware).configure<org.jetbrains.gradle.ext.ModuleSettings> {
            (this as ExtensionAware).configure<org.jetbrains.gradle.ext.PackagePrefixContainer> {
                arrayOf(
                    "src/androidTest/kotlin",
                    "src/main/kotlin",
                    "src/test/kotlin"
                ).forEach {
                    // TODO: Change com.example.template to package name of your own
                    put(it, "com.example.template")
                }
            }
        }
    }
}