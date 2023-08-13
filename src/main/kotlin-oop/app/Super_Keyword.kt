package app
// file main Super_Keyword -> class Shape

import data.Retangle

fun main() {
//    membuat object dari class Retangle
    val retangle = Retangle()
    println("Corner ${retangle.corner}")
    println("Parent  Corner ${retangle.parentCorner}")

    retangle.printName()

}