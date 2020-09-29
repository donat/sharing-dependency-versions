plugins {
    id("com.example.dependency-versions")
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    testImplementation(externalLibraries.junit.gav)
}