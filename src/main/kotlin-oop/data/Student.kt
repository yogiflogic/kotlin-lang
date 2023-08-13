package data
// Class Student -> file main Funtion_Extension

class Student(val name: String, val age: Int)

// ini menggunakan EXTENSION FUNCTION , properties yang ada di class selain PUBLIC tidak akan bisa di akses
fun Student?.sayStudent(name: String){
//    pengecekan untuk data yang bisa null
    if (this != null) {
        println("Hello $name, This Ekstension Function ${this.name}, and age ${this.age} ")

    }
}

// Extentsion properties

val Student.uppername : String
    get() = this.name.uppercase()