package data

// class Person -> file main Object
// class Person -> file main function
// class Person -> file main Function_Overloading
// class Person -> file main This_Keyword

class Person{
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

//    function parent
    fun sayOop(name: String){
        println("Hello $name, my name is ${this.firstName}")
    }

// function overloading
// function overloading dengan nama function yang sama tapi parameternyanya harus berbeda dan return valunya harus sama
    fun sayOop(firstName: String, lastname: String){
//    keyword this akan merujuk kepada properties pada class
//    sangat di rekomendaiskan ketika ingin mengakses PROPERTIS milik object ini sendiri / class  seperti di function di bawah ini menggunakan keyword THIS
        println("Hello $firstName $lastname, my name is ${this.firstName}")
    }

    fun run(){
        println("I'm run")
    }

    fun getFullName(): String{
        return "${this.firstName} $middleName $lastName"
    }

    fun sum(x: Int, y: Int): Int{
//        var z: Int = 0
//        z = x + y
        return x + y
    }
}
