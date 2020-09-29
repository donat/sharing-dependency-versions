package thisbuild

plugins {
    `java-library`
}

repositories {
    jcenter()
}

val externalLibraries = extensions.create<ExternalLibrariesExtension>("externalLibraries")

dependencies {
    testImplementation(externalLibraries.junit)
}