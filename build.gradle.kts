plugins {
    id("java")
}

group = "dev.lyradev.velon.api"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.codemc.io/repository/nms/")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
    compileOnly("org.projectlombok:lombok:1.18.44")
    annotationProcessor("org.projectlombok:lombok:1.18.44")
    compileOnly("org.jetbrains:annotations:24.0.1")
    implementation("org.reflections:reflections:0.10.2")
}
