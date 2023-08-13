package app

// file main Object -> class Person
import data.Person

// cara memanggil class
fun main() {
//    membuat object dari class
    val ziyech = Person()
//    manipulasi properties
    ziyech.firstName = "Hakim"

    val hazard = Person()
    hazard.firstName = "Eden"

    println(ziyech.firstName)
    println(hazard.firstName)
}