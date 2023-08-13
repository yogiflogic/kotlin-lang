fun main() {
//  pakai var
    var x = 0
    while (x < 80) {
        println("Nilai : $x ")
//  pakai var bisa menggunakan x++ karena var secara default valuenya bisa di rubah
        x++
    }

//    pakai val
    val y = 0
    while (y < 10){

        println("Value : $y")

//  Karena pakai val secara default nilainya tidak bisa berubah maka perulangannya harus di tentukan berapa nilai stepnya (y+1)
        y+1
    }

//    infinite loops = looping yang berulang dan tidak berhenti
    val z = 0
    while (z < 10){
        println("Value : $z")
    }

}

