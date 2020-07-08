plugins {
    java
    kotlin("jvm") version "1.3.72"
    id("org.jetbrains.intellij") version "0.4.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

intellij {
//    version = "IU-2020.1.2"
    version = "IU-202.6250-EAP-CANDIDATE-SNAPSHOT"
    instrumentCode = false
}
