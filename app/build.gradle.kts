/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application 
    java 
    eclipse
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit)

    // This dependency is used by the application.
    implementation(libs.guava)
    implementation(libs.jmonkeyEngineCore)
    implementation(libs.jmonkeyEnginelwjgl)
    implementation(libs.jmonkeyEngineDesktop)
    implementation(project(":core_module"))
}

// java {
//     toolchain {
//         languageVersion.set(JavaLanguageVersion.of(11))
//     }

// }

application {
    // Define the main class for the application.
    mainClass.set("com.nttn.legolization.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
