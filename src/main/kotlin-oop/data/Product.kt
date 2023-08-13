package data
// class Product -> file main Data_Class

/*
* - Ketika kita membuat sebuah DATA CLASS secara otomatis KOTLIN akan mengenerate function tostring, haschcode , equal , dll
* - SANGAT DI REKOMENDASIKAN ketika kita membuat class yang dalam bentuk REPRESENTASI data dengan menggunakan DATA class
* - COPY DATA CLASS -> copy() //sangat power full = bisa digunakan untuk mengcopy isi dari properties sebuah class
* */

data class Product (
    val name: String,
    val price: Int,
    val kategori: String
)