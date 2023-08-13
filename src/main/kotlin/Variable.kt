//    keyword CONSTANT untuk keperluan global wajib pakai variable VAL Dengan nama variable UPPER_CASE (Recomended)
const val APP = "Kotlin"
const val VERSION = "0.0.1"

fun main() {
    val firstName: String = "Kotlin"
    val nomor = 46

    println("$firstName $nomor")

//    NULLABLE tidak di rekomendasikan
//    data yang bisa di rubah
    var alamat: String? = "Eko"
    alamat = null

//    error jika di panggil
//    println(alamat.length)
//    cara mengakses yang benar
    println(alamat?.length)

//    CONSTANT
    println("$APP : $VERSION")

}