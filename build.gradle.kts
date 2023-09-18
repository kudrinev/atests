plugins {
    id("java")
    id("io.freefair.lombok") version "6.3.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.rest-assured:rest-assured:5.3.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.assertj:assertj-core:3.6.1")
    implementation("com.codeborne:selenide:6.18.0")
}

tasks.test {
    useJUnitPlatform()
}