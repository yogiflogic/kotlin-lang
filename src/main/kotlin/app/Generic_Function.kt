package app

// file main Generic_Function -> class Function

/*
* GENERIC FUNCTION
* - Scopenya hanya di function itu sendiri
* - parameter typenya bisa di tambahka berapa saja
* */
import data.Function

fun main() {
    val function = Function("Generic Function")
    function.sayGeneric("Generic String")
    function.sayGeneric<String>("Generic String")

    function.sayGeneric(100)
    function.sayGeneric<Int>(700)
}