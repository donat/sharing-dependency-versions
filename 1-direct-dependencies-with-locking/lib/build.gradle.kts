plugins {
    `java-library`
}
repositories {
    jcenter()
}

dependencyLocking {
    lockAllConfigurations()
}

dependencies {
    testImplementation("junit:junit:+")
    implementation("org.apache.commons:commons-math3:+")
}
