package app
// file main Abstract_class -> class Location

/*
* - abstract tidak bisa di buat sebagai object secara lansung
* - secara default class abstract di representasikan sudah OPEN
* - abstract cocok di gunakan untuk PARENT dari semua class turunan (Inheritance) yang kita buat
* */

import data.City
import data.Country

fun main() {
    val city = City("London")
    val country = Country("Inggris")

    println(city.name)
    println(country)
}
