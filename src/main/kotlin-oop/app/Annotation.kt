package app
//file main Annotation -> class annotations.Fancy
//file main Annotation -> class program.MyApplication

import program.MyApplication

fun main() {
    val myApplication = MyApplication("Kotlin", 1)
    println(myApplication.info())
}