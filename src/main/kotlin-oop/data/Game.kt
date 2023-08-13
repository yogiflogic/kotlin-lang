package data
// class Game -> file main Destructuring_Declaration

//cara manual
//class Game(val name: String, val price: Int) {
//    operator fun component1(): String = name
//    operator fun component2(): Int = price
//}

//cara ototmatis membuat component
data class Game(val name: String, val price: Int)