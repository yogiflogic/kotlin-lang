package app

// file mmain function -> class Person
import data.Person

fun main() {
    val kot = Person()

    kot.firstName = "Kotlin di Function biasa"
    kot.middleName = "Programming"
    kot.lastName = "language"

    kot.sayOop("yogiflogic")
    kot.run()

    val fullName = kot.getFullName()
    println(fullName)

    val tambah = kot.sum(6,4)
    println(tambah)

}