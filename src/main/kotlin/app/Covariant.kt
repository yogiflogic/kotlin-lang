package app

/*
* COVARIANT
* - Covariant -> dari sub type ke parent
* - untuk mengimplementasikan Covariant, gunakan keyword (in) pada parameter generic parentnya
* */

class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }

//  tidak bisa membuat function dengan input generic COVARIANT
//    fun setData(param: T){
//        data = param
//    }
}

fun main() {
    val covariantString = Covariant<String> ("This is Covarian parameter")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantString)
    println(covariantAny)

//   covariant tidak di izinkan dengan parameter
//    covariantAny.setData(100)
}