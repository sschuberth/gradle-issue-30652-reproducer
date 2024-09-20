plugins {
    // Use Kotlin DSL to write precompiled script plugins.
    `kotlin-dsl`
}

repositories {
    mavenCentral()

    // Allow to resolve external plugins from precompiled script plugins.
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.20")
}
