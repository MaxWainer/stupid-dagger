/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    kotlin("jvm") version "1.7.20"

    // Apply org.jetbrains.kotlin.kapt Plugin to add support for dagger
    kotlin("kapt") version "1.7.20"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

// versions
val daggerVersion = "2.44"

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.0.1-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    // Use the dagger dependencies
    implementation("com.google.dagger:dagger:$daggerVersion")

    // Implement dagger via kapt plugin (to auto-generate code)
    kapt("com.google.dagger:dagger-compiler:$daggerVersion")
}

application {
    // Define the main class for the application.
    mainClass.set("stupid.dagger.AppKt")
}
