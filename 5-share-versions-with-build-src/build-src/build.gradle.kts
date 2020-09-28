plugins {
    `kotlin-dsl`
    id("com.example.dependency-versions")
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.example:dependency-versions")
    testImplementation(externalLibraries.junit.gav) // test if the dependency versions can be used in buildSrc
}