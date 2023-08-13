package app

import data.User

// file main Properties_Constructor -> class User
fun main() {
    val user1 = User("userkotlin","password1")
    val user2 = User("userkotlin2","password2")
    val user3 = User("Cara ke 2","recommended")

    println(user1.username)
    println(user1.password)
    println()
    println(user2.username)
    println(user2.password)
    println()
    println(user3.username)
    println(user3.password)
}