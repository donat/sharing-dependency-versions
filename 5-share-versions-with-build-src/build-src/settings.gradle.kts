rootProject.name = "build-src"
include("thisbuild-java-subproject")

pluginManagement {
    repositories {
        maven(url = "dependency-versions-plugin/repo")
        gradlePluginPortal()
    }
}