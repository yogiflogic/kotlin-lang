package app

// file main singleton_object -> object Utilities
// file main singleton_object -> class Application

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Singleton Object"))

    println(Application.Utilities.toUpper("This Is Inner Object"))
    println(Application.toLower("This companion object"))
}