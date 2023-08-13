package app
//PR -> class Fruit
import data.Fruit
/*
* - Di Kotlin mendukung operator override yang mana kita bisa membuat function dari operator seperti operator matemetika
*
* */

fun main() {
    val fruit1 = Fruit(250)
    val fruit2 = Fruit(100)
//    contoh pemanggilan operator loading
    val fruit3 = fruit1 + fruit2

    println(fruit3 - Fruit(100))

}