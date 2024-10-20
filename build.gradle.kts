// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.25" apply false
    kotlin("jvm") version "2.0.21" apply false
    alias(libs.plugins.compose.compiler) apply false
}
buildscript {
    dependencies {
        classpath(kotlin("gradle-plugin", version = "2.0.21"))
    }
}