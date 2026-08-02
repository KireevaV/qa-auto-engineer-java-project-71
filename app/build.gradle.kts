plugins {
    id("java")
    id("application")
    id("com.github.ben-manes.versions") version "0.54.0"
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-parameters")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("info.picocli:picocli:4.7.6")
}

tasks.test {
    useJUnitPlatform()
}