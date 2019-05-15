import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    kotlin("jvm") version "1.3.11"
}

group = "br.com.trf"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}


dependencies {
    compile(kotlin("stdlib-jdk8"))

    implementation("ch.qos.logback:logback-classic:1.2.3")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}