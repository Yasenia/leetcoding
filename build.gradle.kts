import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0-M2"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    testImplementation(platform("org.junit:junit-bom:5.8.0-M1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("com.fasterxml.jackson.core:jackson-core:2.12.2")
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.2")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
    test {
        useJUnitPlatform()
    }
}
