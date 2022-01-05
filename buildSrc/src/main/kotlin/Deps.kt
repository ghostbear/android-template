object Deps {

    object kotlin {
        const val version = "1.5.20"
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object androidx {
        const val corektx = "androidx.core:core-ktx:1.7.0"
        const val appcompat = "androidx.appcompat:appcompat:1.4.0"
        const val material = "com.google.android.material:material:1.4.0"
    }

    object junit {
        const val core = "junit:junit:4.13.2"
        const val android = "androidx.test.ext:junit:1.1.3"
    }

    const val espresso = "androidx.test.espresso:espresso-core:3.4.0"

}