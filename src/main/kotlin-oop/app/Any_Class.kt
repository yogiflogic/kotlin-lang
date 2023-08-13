package app
// file main Any_Class -> class Laptop
import data.SmartPhone

fun main() {

    val smartPhone = SmartPhone("Nexus", "Android")
    val smartIos = "123"

    println(smartPhone.toString())
    println(smartPhone.hashCode())
    println(smartIos.toFloat())
}