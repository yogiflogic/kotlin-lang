fun heyLamda(name: String, transformer: (String) -> String): String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
}

fun main() {
    val lamdaUpper = {value: String -> value.toUpperCase()}
    println(heyLamda("Kotlin",lamdaUpper))

    println(heyLamda("Kotlin",{value: String -> value.lowercase()}))

//    Trailing Lamda
    val result = heyLamda("Kotlin Trailing"){
            value: String -> value.lowercase()}

    println(result)
}