rootProject.name = "sharing-dependency-versions"
include("lib")
includeBuild("build-src")

pluginManagement {
    repositories {
        maven(url = "dependency-versions-plugin/repo")
        gradlePluginPortal()
    }
}