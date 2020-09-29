plugins {
    id("thisbuild.external-libraries")
    `java-library`
}

dependencies {
    implementation(platform(project(":platform")))
    testImplementation(externalLibraries.junit)
}
