package com.example

class ExternalLibrary {
    val ga: String
    val gav: String
    val version: String

    constructor(gav : String) {
        val gavList = gav.split(":")
        this.ga = "${gavList[0]}:${gavList[1]}"
        this.gav = gav
        this.version = gavList[2]
    }
}