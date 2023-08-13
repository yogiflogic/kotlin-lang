package app

// file main secondary_Constructor -> class Adrress

import data.Address

fun main() {
    val addrees1 = Address("Jl.Kebenaran","Jakarta")
    val addrees2 = Address("Jl.Kebenaran2","Jakarta2","Indonesia")

    println(addrees1.street)
    println(addrees2.country)

}