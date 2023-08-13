package data
//class CAR -> file main Constructor

//constructor -> fungsi pertama yang kali di jalankan (membuat constructor harus memakai parameter)
//constructor bisa di buat lebih dari satu tapi jumlah parameternya harus berbeda
//perbedaan menggunakan constructor lebih dari 2 adalah saaat kita bikin object sekarang kita memiliki opsi untuk memnggil primary constructor atau secondary

//sebenarnya kita juga bisa tidak membuat primary constructor (go to address class)
//di secondary (tanpa ada primary constructor) tidak wajib menggunakan keyword (THIS) boleh jika ingin menggunakannya
//Keyword THIS sebenarnya berfungsi untuk memanggil VALUE constructor di atasnya / sebelumnya
//primary constructor TIDAK wajib

//constructor primary
class Car(paramBrand: String,paramName: String , paramYear: Int) {

//    gunakan keyword init ketika CLASS di jadikan object, jika memang di perlukan dan di rekomendasikan untuk code yang simple saja
    init {
        println("Ini bagian Init $paramBrand pada contructor, kode yang di tambahkan pada jika di perlukan")
        println()
    }

//    constructor secondary wajib menggunakan keyword (constructor) dan memanggil parameternya menggunakan keyword titik dua (:) dan (this)
    constructor(paramBrand: String, paramName: String )
//Keyword THIS sebenarnya berfungsi untuk memanggil VALUE constructor di atasnya / sebelumnya
        : this(paramBrand,paramName, 2020){
        println("Constructor 1")
        println()
    }

    constructor(paramBrand: String) : this(paramBrand,""){
        println("Constructor 2")
        println()
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}

