package app
// file main Super_Constructor -> class Customer

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCutomer = PremiumCustomer("Kotlin")
    println(premiumCutomer.name)

    val executiveCustomer = ExecutiveCustomer("Language",46)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}