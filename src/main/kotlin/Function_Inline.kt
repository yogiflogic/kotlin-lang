// PR
inline fun helloKot(name: () -> String): String{
    return "${name()}"
}

inline fun hellolang(
    fName: () -> String,
    noinline lName:() -> String): String{
    return "${fName()} ${lName()}"
}

fun main() {
    println(helloKot { "Kotlin Power Full" })

    for (i in 0..100){
        println("${i}")
        println(hellolang({"Kotlin"}, {"Programming"}))
    }
}