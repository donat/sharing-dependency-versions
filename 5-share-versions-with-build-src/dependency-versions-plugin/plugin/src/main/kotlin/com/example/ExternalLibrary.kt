package com.example

class ExternalLibrary {
    val gav: String

    constructor(params : String) {
        val paramList = params.split(",")
        gav = paramList[0]

    }
}