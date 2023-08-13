package app

// file main Function_Overloading -> class Person

import data.Person
/*
* function overloading = membuat function yang sama (nama function) dalam satu class
*
* SYARAT :
*
* - nama parameternya berbeda atau jumlah parameternya berbeda dan return valuenya harus sama atau
* - nama parameter boleh sama tapi tipe datanya harus berbeda
* */

fun main() {
    val kot = Person()
    kot.firstName = "kotlin di Function Overloading"

    kot.sayOop("Kotlin","Language")
}