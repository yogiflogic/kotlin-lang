fun main() {
    fun heyLamda(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val uppc = fun(value: String): String {
        if (value == "") {
            return "anonymous"
        } else {
            return value.uppercase()
        }
    }
        println(heyLamda("Kotlin", uppc))
        println(heyLamda("Kotlin", fun(value: String): String {
                return value.uppercase()
            }))


}