package thisbuild

plugins {
    `java-library`
}

repositories {
    jcenter()
}

extensions.create<ExternalLibrariesExtension>("externalLibraries")

dependencies {
    implementation(platform(project(":platform")))
    testImplementation(project.extensions.getByType(ExternalLibrariesExtension::class).junit)
}