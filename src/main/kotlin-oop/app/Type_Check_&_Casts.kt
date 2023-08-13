package app
// tidak ada relasi class

import data.Handphone
import data.Laptop

/*
* PENGGUNAAN ANY CLASS
* - Any merupapakan sebuah class yang bisa menerima parameter dalam bentuk apapun
* */

fun printObject(any: Any) {
    if (any is Laptop) {
       println("${any.name}")
    } else if (any is Handphone) {
        println("${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("With When ${any.name}")
        is Handphone -> println("With When : ${any.name}")
        else -> println(any)
    }
}

//    keyword as = unsafe casts (hati-hati dengan output tipe datanya)
// gunakan tanda tanya (as?) jika tidak ingin outputnya error , dan jika tipe datanya tidak sesuai akan di konversi menjadi NULL
fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("String")
    printObject(1234567)
    printObject(Laptop("Dell"))
    printObject(Handphone("Nexus"))
    printObjectWithWhen(Laptop("Dell"))
    printObjectWithWhen(Handphone("Nexus"))

//    unsafe casts
    printString("Kotlin ANY CLASS")

//    keyword as = Eror karena representasi tipe datanya di set menjadi String
//    printString(1)

//    dengan as? = akan menjadi null jika tipe data output dan input di sesuai
    printStringSafe(2)
}