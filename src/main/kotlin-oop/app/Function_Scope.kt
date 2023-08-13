package app
/*
* Helper function scope
* - Tujuan di gunakan agar Kodingan lebih enak di baca
* */

import data.Student

fun main() {
    val student = Student("Kot", 146)
//    cara 1 dengan it
    val result: String = student.let{
        "Name is ${it.name} and Age is ${it.age}"
    }
    println(result)

//     cara 2 dengan this
    val result2: String = student.run{
        "Name is ${this.name} and Age is ${this.age}"
    }
    println(result2)


//  apply return valuenya object itu sendiri (Student)
    val result3: Student = student.apply{
        "Name is ${this.name} and Age is ${this.age}"
    }
    println(result3.name)
    println(result3.age)

//    also return valuenya Object itu sendiri (Student)
    val result4: String = student.let{
        "Name is ${it.name} and Age is ${it.age}"
    }
    println(result4)

    val result5: String = with(student){
        "Name is ${this.name} and Age is ${this.age}"
    }
    println(result5)

}