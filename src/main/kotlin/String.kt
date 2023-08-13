fun main() {
    var x: String = "Kotlin"
    var y: String = """
        Belajar kotlin basic
        dengan benar
    """.trimIndent()
    var z: String = """
        |Belajar kotlin basic,
        |trimMargins
    """.trimMargin(">")

    println(x)
    println(y)
    println(z)
    println()

    var name: String = "Kotlin"
    var jenis: String = "Programming Languange"

    var fullName: String = name + " " + jenis

//    string template dengan menggunakan tanda dolar ($) untuk mengakses isi value dari sebuah variable
    var desc: String = "$fullName  Char: ${fullName.length}"

    println(fullName)
    println()
    println(desc)
}