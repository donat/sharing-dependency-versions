plugins {
    id("thisbuild.external-libraries")
    `java-platform`
}


dependencies {
    constraints {
        api("${externalLibraries.commonsMath}:3.4.1")
        api("${externalLibraries.junit}:4.13")
    }
}