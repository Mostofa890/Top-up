plugins {
    id("com.android.application")
    // Firebase Google Services Plugin
    id("com.google.gms.google-services")
    // The Flutter Gradle Plugin must be applied after the Android plugin
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.mcash.wala"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        applicationId = "com.mcash.wala"
        minSdk = flutter.minSdkVersion // Firebase এর জন্য minSdk 23 প্রয়োজন
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}
