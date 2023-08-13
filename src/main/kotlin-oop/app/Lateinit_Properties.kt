package app
// file main lateinit_properties -> class Television

import data.Television

fun main() {
    val tv = Television()
    tv.iniTelevition("Dell")
    println(tv.brand)
}