package app

/*
* Star Projection gunakan type generic dengan tanda bintang (*)
* - Star Projection tidak peduli tipe data genericnya apa
* - Digunakan untuk jika tidak butuh datanya tapi butuh mengakses hal lain dari generic objectnya
* */

fun displayLength(array: Array<*>){
    println("Total array ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(3,5,7,8,5,8,9,5,4,3)
    val arrayString: Array<String> = arrayOf("Vale","Peco","Morbi","Marini")

    displayLength(arrayInt)
    displayLength(arrayString)

}