package app

// file main Visibility_Modifier -> class Teacher

import data.SuperTeacher

fun main() {

    val superteach = SuperTeacher("Visibility Modifier")

    println(superteach.name)

//    EROR = function parentnya di private
//    println(superteach.teach())

//    function parentnya di protected tapi override di class child di publish
    println(superteach.test())

}