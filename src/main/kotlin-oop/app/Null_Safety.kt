package app
// PR

// file main Null safety

data class Friend(val name: String)

fun sayNullSafety(friend: Friend?){
// cara ke 1 (recommended)
    if (friend != null){
        println("Helllo ${friend.name}")
    }
    println("Hello ${friend?.name}")

// cara ke 2
//    ELVIS operator
//    val name = friend?.name ?: "Elvis Operator"
//    println("Hello $name")

// cara ke 3
//    Memaksa agar seolah-olah tidak null dengan operator (!!)
//    val notNullFriend = friend!!
//    val name = notNullFriend.name
//    println("Hello $name")
}

fun main() {
    sayNullSafety(Friend("Kot"))
}