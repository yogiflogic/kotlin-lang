package app

// file main Data_Class -> class Product

import data.Product

fun main() {
    val product = Product("YZR-M1", 1200 , "Motor" )

//    COPY DATA CLASS sangat power full
    val product2 = product.copy(name = "Ducati", 1500)

    println(product)

//  Hasil COPY DATA CLASS
    println(product2)

    showTambah()

    showStringToInt()
}

private fun showTambah(){
    val a = 9
    val b = 2
    println(tambah(a,b))
}

private fun tambah(x: Int, y: Int): Int{
    return x.plus(y)
}

private fun showStringToInt(){
    val a = "11"
    val b = a.toInt()
    println(b)
}