package com.example

import org.gradle.api.Project
import org.gradle.api.Plugin

class DependencyVersionsPluginPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // TODO any way to find root project from an included build?
        val projectDir = if (project.rootProject.name == "build-src") project.rootProject.projectDir.parentFile else project.rootProject.projectDir
        project.extensions.create("externalLibraries", ExternalLibrariesExtension::class.java, projectDir)
    }
}
