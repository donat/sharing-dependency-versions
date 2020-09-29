package thisbuild

plugins {
    `java-library`
}

repositories {
    jcenter()
}

extensions.create<ExternalLibrariesExtension>("externalLibraries", project.rootProject.projectDir)

dependencies {
    testImplementation(project.extensions.getByType(ExternalLibrariesExtension::class).junit.gav)
}