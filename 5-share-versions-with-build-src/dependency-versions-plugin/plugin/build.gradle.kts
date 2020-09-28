plugins {
    `java-gradle-plugin`
    `maven-publish`
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
}

repositories {
    jcenter()
    maven {
        name = "localrepo"
        url = uri(file("../repo"))
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

group = "com.example"
version = "1.0.0"

gradlePlugin {
    val greeting by plugins.creating {
        id = "dependency-versions"
        implementationClass = "com.example.DependencyVersionsPluginPlugin"
    }
}

publishing {
    repositories {
        maven {
            name = "localrepo"
            setUrl(file("../repo"))
        }
    }
    publications {
        create<MavenPublication>("maven") { from(components["java"]) }
    }
}

