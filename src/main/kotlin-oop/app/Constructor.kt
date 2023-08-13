package app
// file main Constructor -> class CAR
import data.Car

fun main() {
    val bmw = Car("BMW i8","White",2018)
//   salah satu cara merubah nilai default constractor
    bmw.year = 2017

    val lambhorgini = Car("Veneno")

    println(bmw.brand)
    println(bmw.name)
    println(bmw.year)
    println()
    println(lambhorgini.brand)
    println(lambhorgini.year)
}