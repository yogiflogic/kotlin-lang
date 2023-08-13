//PR
//Lamda tidak bisa di return
fun toUpper(value: String): String = value.uppercase()

fun main() {
// Lambda
    val contohLamda: (String, String) -> String = {firstName: String,lastName : String ->
                        val result = "$firstName $lastName"
                        result
    }
    val hasil = contohLamda("Kotlin","Programming")
     println(hasil)

//  keyword it
    val sayKotl: (String) -> String = {
        "Hello : $it"
    }

    println(sayKotl("Kotlin"))


//    method reference

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase)
}