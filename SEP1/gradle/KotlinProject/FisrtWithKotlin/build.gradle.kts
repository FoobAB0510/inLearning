plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.kotlinab"

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("io.ktor:ktor-client-core:1.6.4")
    implementation("io.ktor:ktor-client-cio:1.6.4")
    implementation("io.ktor:ktor-client-json:1.6.4")
    implementation("io.ktor:ktor-client-serialization:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation(kotlin("stdlib"))
    implementation("com.microsoft.sqlserver:mssql-jdbc:12.8.1.jre11")
    testImplementation(kotlin("test"))
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.kotlinab.MainKt"
    }
}

tasks.test {
    useJUnitPlatform()
}