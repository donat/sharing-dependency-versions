package thisbuild
import java.io.File
import java.io.FileReader
import java.util.Properties

abstract class ExternalLibrariesExtension {
    val commonsMath : ExternalLibrary
    val junit : ExternalLibrary

    constructor(rootProjectDir: File) {
        val properties = getProperties(rootProjectDir)

        commonsMath = ExternalLibrary(properties["commonsMath"] as String)
        junit = ExternalLibrary(properties["junit"] as String)
    }

    companion object LibraryProperties {
        var properties: Properties? = null

        fun getProperties(rootProjectDir : File): Properties {
            if (properties == null) {
                val propertiesFile = File(rootProjectDir, "dependencies.properties")
                val properties = Properties()
                properties.load(FileReader(propertiesFile))
                this.properties = properties
            }
            return properties!!
        }
    }
}
