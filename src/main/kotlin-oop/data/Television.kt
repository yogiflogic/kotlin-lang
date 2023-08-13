package data
// class Television -> file main lateinit_properties

/*
*- lateinit keyword yang berfungsi untuk mengisi value sebuah properties tidak harus ketika properties dibuat
* - biasanya lateinit digunakan karena menggunakan framwork java , karena di framework java variable tidak wajib di deklarasikan lansung
* */

class Television {
    lateinit var brand: String

    fun  iniTelevition(brand: String){
        this.brand = brand
    }
}