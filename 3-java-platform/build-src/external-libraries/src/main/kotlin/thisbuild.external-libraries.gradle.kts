import thisbuild.ExternalLibrariesExtension

repositories {
    jcenter()
}

val externalLibraries = extensions.create<ExternalLibrariesExtension>("externalLibraries")
