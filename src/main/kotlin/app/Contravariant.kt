package app
/*
* Contravariant
* - Bisa melakukan subtitusi dari parent ke childnya
* - Hanya untuk class generic yang menggunakan generic parameter di functionya
* - Hanya boleh untuk menerima input data genericnya
* - untuk mengimplementasikan Contaravariant, gunakan keyword (in) pada parameter generic parentnya
* */
class Contravariant<in  T> {
    fun sayContravariant(param: T){
        println("Hello $param")
    }
}

// di Contravariant tidak boleh membuat function yang mengembalikan data generic
//fun getData(): T {
//    return  data
//}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayContravariant("Contravariant String")
}