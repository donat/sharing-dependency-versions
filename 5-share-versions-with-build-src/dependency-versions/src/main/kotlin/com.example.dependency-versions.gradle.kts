import com.example.ExternalLibrariesExtension

project.extensions.create<ExternalLibrariesExtension>("externalLibraries", gradle.rootBuild().rootProject.projectDir)

fun Gradle.rootBuild(): Gradle = parent.let { it?.rootBuild() ?: this }