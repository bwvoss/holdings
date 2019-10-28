plugins {
  kotlin("jvm") version "1.3.50"
  id("com.github.johnrengelman.shadow") version "5.1.0"
  application
}

application {
  mainClassName = "MainKt"
}

repositories {
    mavenCentral()
}

tasks {
  withType<Test> {
    useJUnitPlatform()
  }
}

dependencies {
  implementation(kotlin("stdlib"))
  testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

// Define the main startup class and jar name
//archivesBaseName = "step-by-step-kotlin"

// tell the jar which class to startup in.
//jar {
//    manifest {
//        attributes("Main-Class": "MainKt")
//    }
//}
