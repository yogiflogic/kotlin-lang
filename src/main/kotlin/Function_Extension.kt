//extension function
fun String.hello(): String = "Hello $this"

fun String.prinlnHello(): Unit = println("Hey $this")

fun main() {
    val name = "Kotlin"

    println(name.hello())

    name.prinlnHello()

    "Programming".prinlnHello()
}