plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.compose.compiler) apply false
}

// AGP 9 has built-in Kotlin support. This classpath raises the embedded KGP used by
// built-in Kotlin to the same stable version used by the Compose compiler plugin.
buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.3.21")
    }
}
