plugins {
    `kotlin-dsl`
    id("dependency-versions") version "1.0.0"
}

repositories {
    jcenter()
    maven(url = "../../dependency-versions-plugin/repo")
}

dependencies {
    testImplementation(externalLibraries.junit.gav) // test if the dependency versions can be used in buildSrc
    implementation("com.example:plugin:1.0.0") // workaround be able to use ExternalLibrariesExtension in convention plugin
}