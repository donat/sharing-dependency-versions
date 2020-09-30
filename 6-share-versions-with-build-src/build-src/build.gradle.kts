plugins {
    `kotlin-dsl`
    id("com.example.dependency-versions")
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.example:dependency-versions")

    // test if the dependency versions can be used in buildSrc
    constraints {
        api(externalLibraries.junit.ga) {
            version {
                strictly(externalLibraries.junit.version)
            }
        }
    }
    testImplementation(externalLibraries.junit.ga)
}