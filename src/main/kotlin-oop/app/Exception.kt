package app

//file main Exception -> class Validation_Exception

/*
* - Untuk membuat pesan error di kotlin gunakan keyword Throwable dan di ikuti dengan object errornya
* - exception di kotlin bisa di tangkap jika terjadi error dengan block code try catch dan kita bisa melakukan sesuatu di dalamnya
* - Di kotlin , error di representasikan dengan exception , dimana semua jenis error merupakan class turunan dari Throwable
* - Di kotlin , try catch digunakan untuk mencoba melakukan sesuatu, jika terjadi error akan di tangkap dan kita bisa memberi reaksi sesuai yang kita mau
* - Di kotlin kita bisa menggunakan  multiple block Catch untuk mengangkap jenis exeption yang berbeda
* - keyword Finally bisa di tambahkan di Try Catch, finally akan selalu di jalankan , baik programmanya sukses maupun tidak
* - gunakan finnaly jika memang perlu
* */

import exception.ValidationException

fun sayException(name : String){
    if (name.isBlank()){
        throw ValidationException("Name is blank")
    }else{
        println("Say $name")
    }
}

fun main() {
    try {
        sayException("Method Exeption")
    }catch (error: ValidationException){
        println("Terjadi error ${error.message}")
    }catch (error: Throwable){
        println("Terjadi error Throwable ${error.message}")
    } finally {
        println("Program keyword finally sukses")
    }
}