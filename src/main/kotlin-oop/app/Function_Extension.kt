package app
// file main Funtion_Extension -> Class Student

/*
* EXTENSION FUNCTION
* - di kotlin jika ingin sebuah value bisa null gunakan tanda tanya (?)
* - secara default extention function hanya bisa untuk data yang tidak null
* */

/*
* EXTENSION PROPERTIES
* - Untuk mmbuat extension properties , kita bisa membuat properties dengan GETTER atau SETTER
* */
import data.Student
import data.sayStudent
import data.uppername

fun main() {

    val student = Student("Kot",25)
    println(student.sayStudent("programming"))

//    pemanggilan extension properties
    println(student.uppername)

}