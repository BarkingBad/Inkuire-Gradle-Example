plugins {
    kotlin("jvm") version "1.4.0"
    id("org.jetbrains.dokka") version "1.4.10-dev-47"
}

repositories {
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    mavenCentral()
    jcenter()
    mavenLocal()
}

dependencies {
    dokkaPlugin("org.virtuslab:inkuire-plugin:1.0-SNAPSHOT")
}

tasks.dokkaHtml {
    dependsOn(tasks.clean)

    dokkaSourceSets {
        configureEach {
            sourceRoot(File("/home/aratajczak/Pobrane/jdk-8u261-linux-x64/jdk1.8.0_261/src/java/util"))
            sourceRoot(File("/home/aratajczak/Pobrane/jdk-8u261-linux-x64/jdk1.8.0_261/src/java/io"))
        }
    }
}

