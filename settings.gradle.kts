rootProject.name = "reproducer-project"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    // Gradle cannot access the version catalog from here, so hard-code the dependency.
    id("org.gradle.toolchains.foojay-resolver-convention").version("0.9.0")
}
