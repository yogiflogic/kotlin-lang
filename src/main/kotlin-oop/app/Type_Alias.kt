package app
// file main Type_Alias -> Application1
// file main Type_Alias -> Application2

/*
* - Type alias (typealias) bisa di gunakan untuk class dan function
*
* */

import data.Application



typealias App = Application
typealias App2 = data2.Application.Utilities

// typealias pada LAMDA
typealias StringSupplier = () -> String
fun sayTypeAlias(suplier: StringSupplier){
    println("Hello ${suplier()}")
}

fun main() {
    val app = App.toLower("TYPE ALIAS")
    val app2 = App2.toUpper("type alias upper")

    println(app)
    println(app2)

    sayTypeAlias { "Kotlin Type Alias" }

}