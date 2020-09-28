package thisbuild

plugins {
    `java-library`
}

repositories {
    jcenter()
}

extensions.create<ExternalLibrariesExtension>("externalLibraries")

dependencies {
    testImplementation(project.extensions.getByType(ExternalLibrariesExtension::class).junit)
}