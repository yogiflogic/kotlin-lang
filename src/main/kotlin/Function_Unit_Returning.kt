//function yang tidak mengembalikan (return function) data, sebenarnya by default sudah mendeklarasikan tipe data UNIT (seperti VOID di java)
fun unitKotlin(name: String?):Unit{
    println("$name")
}

fun main() {
    unitKotlin("Kotlin Unit")
}