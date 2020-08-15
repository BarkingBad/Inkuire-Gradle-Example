plugins {
    kotlin("jvm") version "1.4.0-rc"
    id("org.jetbrains.dokka") version "1.4.0-rc-SNAPSHOT"
}

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
    mavenLocal()
    jcenter()
}

dependencies {
    dokkaPlugin("org.virtuslab:inkuire-plugin:1.0-SNAPSHOT")
}

tasks.dokkaHtml {
    dependsOn(tasks.clean)
    outputDirectory = "$buildDir/dokka"
    dokkaSourceSets {
        configureEach {
            sourceRoot {
                path = "PATH_TO_FILES"
            }
        }
    }
}

