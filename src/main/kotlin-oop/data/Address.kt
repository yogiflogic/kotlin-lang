package data
// class Adrress -> file main secondary_Constructor


class Address {

    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    constructor(paramStreet: String, paramCity: String){
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
    //Keyword THIS sebenarnya berfungsi untuk memanggil VALUE constructor di atasnya / sebelumnya
            : this(paramStreet, paramCity){
        country = paramCountry
    }
}