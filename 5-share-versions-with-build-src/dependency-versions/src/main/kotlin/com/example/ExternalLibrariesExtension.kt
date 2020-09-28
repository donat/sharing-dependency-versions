package com.example

import java.io.File
import java.io.FileReader
import java.util.Properties

abstract class ExternalLibrariesExtension(rootProjectDir: File) {
    private val properties: Properties

    val commonsMath : ExternalLibrary
        get() = ExternalLibrary(properties["commonsMath"] as String)

    val junit : ExternalLibrary
        get() = ExternalLibrary(properties["junit"] as String)

    init {
        val dependenciesProperties = File(rootProjectDir, "dependencies.properties")
        properties = if (dependenciesProperties.exists()) {
            FileReader(dependenciesProperties).use {
                Properties().apply { load(it) }
            }
        } else {
            Properties()
        }
    }
}
