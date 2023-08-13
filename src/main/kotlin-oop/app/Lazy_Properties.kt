package app
// - file main Lazy_Properties -> class Account

/*
* Lazy Properties
* - Kotlin juga mendukung delegation properties dengan keyword lazy
* - layz adalah standard library yang tersedia agar properties baru di inisialisasi ketika properties itu di akses
* */
import data.Account

fun main() {
    val Acc = Account()
    println(Acc.name)
}