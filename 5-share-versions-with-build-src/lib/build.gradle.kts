plugins {
    id("thisbuild.java-subproject")
}

dependencies {
    implementation(externalLibraries.commonsMath.gav)
    testImplementation(externalLibraries.junit.gav) // TODO should go to convention plugin
}
