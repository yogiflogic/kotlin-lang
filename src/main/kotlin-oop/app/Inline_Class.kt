package app
// file main

import data.Token

fun main() {
    val token = Token("This token")
    println(token.value)
    println(token.toUpper())
}