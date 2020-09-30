plugins {
    id("com.example.dependency-versions")
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    constraints {
        api(externalLibraries.junit.ga) {
            version {
                strictly(externalLibraries.junit.version)
            }
        }
    }

    constraints {
        api(externalLibraries.commonsMath.ga) {
            version {
                strictly(externalLibraries.commonsMath.version)
            }
        }
    }

    testImplementation(externalLibraries.junit.ga)
}