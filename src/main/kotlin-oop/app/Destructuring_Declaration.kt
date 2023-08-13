package app
// file main Destructuring_Declaration -> class Game
// file main Destructuring_Declaration -> class MinMax
// file main Destructuring_Declaration -> class Login

/*
* Destructuring_Declaration
* - Destructuring_Declaration -> membuat multiple variable dari sebuah object yang sudah ada
* - Di kotlin juga bisa Destructuring_Declaration untuk memanggil function , yang seakan akan kita bisa mengembalikan multiple return value pada function
* - jika ada variable yang tidak kita butuhkan maka peri underscore (_) (min, _)
* - Destructuring_Declaration bisa di lakukan di mana saja selama object mempunyai function componentX nya
* */

import data.Game
import data.Login
import data.MinMax

//    Destructuring_Declaration pada function
fun minmax(value1: Int, value2: Int): MinMax{
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

//    Destructuring_Declaration pada lambda  parameter
fun  login(login: Login, callback: (Login) -> Boolean) : Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 10000)

    val (name, price) = game
    println(name)
    println(price)

//    Destructuring_Declaration pada function
//    val result = minmax(10, 100)
//    val min = result.min
//    val max = result.max
//

//    cara rekomended
    val (min, max) = minmax(10,100)
    println(min)
    println(max)

//    Destructuring_Declaration pada lambda parameter
    val login = Login("Kotlin", "Lang")
    login(login){ login ->
    login.username == "Kotlin" && login.password == "Lang"

    }

    login(login) { (username, password) ->
        username == "Kotlin" && password == "Lang"
    }

}