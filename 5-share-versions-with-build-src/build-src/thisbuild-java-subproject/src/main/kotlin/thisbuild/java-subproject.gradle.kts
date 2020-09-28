package thisbuild

import com.example.ExternalLibrariesExtension

plugins {
    `java-library`
}

apply(plugin = "dependency-versions") // TODO cannot use plugins block

repositories {
    jcenter()
}

dependencies {
    testImplementation(project.extensions.getByType(ExternalLibrariesExtension::class.java).junit.gav)
}