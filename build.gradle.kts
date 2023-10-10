plugins {
    id("java")
    id("io.qameta.allure") version "2.9.6"
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
    implementation("io.qameta.allure:allure-rest-assured:2.24.0")
    implementation("org.aeonbits.owner:owner:1.0.12")
    testImplementation("org.jdbi:jdbi3-postgres:3.41.2")
    implementation("org.jdbi:jdbi3-sqlobject:3.41.2")
    implementation("org.jdbi:jdbi3-core:3.41.2")

    implementation("com.appslandia:pebble-templates:1.0")
    implementation("org.springframework.kafka:spring-kafka:3.0.11")
    implementation("com.github.javafaker:javafaker:1.0.2")
    testImplementation("org.awaitility:awaitility:4.2.0")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.20.0")
    implementation("com.itextpdf:itextpdf:5.5.13.3")
    implementation("org.apache.poi:poi-ooxml:5.2.3")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-csv:2.15.2")
    testImplementation("org.junit.platform:junit-platform-launcher:1.10.0")
    implementation("com.codeborne:selenide:6.18.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testImplementation("io.qameta.allure:allure-junit5:2.24.0")
    implementation("io.qameta.allure:allure-assertj:2.24.0")
    testImplementation("org.assertj:assertj-core:3.6.1")
    testImplementation("org.slf4j:slf4j-simple:2.0.9")

    runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")


}

tasks.test {
    useJUnitPlatform()
}