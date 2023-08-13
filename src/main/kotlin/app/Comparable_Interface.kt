package app
// file main Comparable_Interface -> class Fruit

import data.Fruit

fun main() {
    val fruit1 = Fruit("Pisang",100)
    val fruit2 = Fruit("Anggur",50)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)

}