package thisbuild

plugins {
    `java-library`
}

repositories {
    jcenter()
}

val externalLibraries = extensions.create<ExternalLibrariesExtension>("externalLibraries")

dependencies {
    constraints {
        api(externalLibraries.junit.ga) {
            version {
                require(externalLibraries.junit.version)
            }
        }
        api(externalLibraries.commonsMath.ga) {
            version {
                require(externalLibraries.commonsMath.version)
            }
        }
    }
    testImplementation(externalLibraries.junit.ga)
}