package app
//  file main Properties_Overriding -> class Shape

import data.Retangle
import data.Shape
import data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val retangle = Retangle()
    println(retangle.corner)

    val triangle = Triangle()
    println(triangle.corner)
}