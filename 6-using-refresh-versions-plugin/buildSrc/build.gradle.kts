plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    gradlePluginPortal()
}

dependencies {
    testImplementation("junit:junit:_") // test if the dependency versions can be used in buildSrc
    implementation("gradle.plugin.com.github.ksoichiro:gradle-spelling-plugin:_")
}