import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("jvm") version "1.4.0"
    id("org.jetbrains.dokka") version ("1.4.0")
}

repositories {
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
}

tasks.register<DokkaTask>("dokkaCustomFormat") {
    dependencies {
        // Using the javadoc plugin as "custom format". Can use any plugin here!
        plugins("org.jetbrains.dokka:javadoc-plugin:1.4.0")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
}
