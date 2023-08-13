package app
// file main Delegates_Observable -> class Account

import data.Account
/*
* Delegates observable
* - Salah satu library standar yang tersedia di kotlin untuk delegasi properties selain lazy
* - sebuah delegasi yang berfungsi untuk mendeteksi perubahan value awal dan value akhir pada properties
* */

fun main() {
    val acc = Account()

    acc.description = "Vale"
    acc.description = "Morbi"
    acc.description = "Pecco"
}