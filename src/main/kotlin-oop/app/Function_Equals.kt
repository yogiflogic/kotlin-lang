package app
// file main Function EQUALS -> class COMPANY

import data.Company

/*
*- secara DEFAULT Di Kotlin 2 object yang berbeda meskipun nilai atributnya sama akan bernilai false , karna tidak bisa di bandingkan dengan operator == atau !=
*- Gunakan equals class any dan setelah EQUALS (milik class any) di override kita bisa melakukan perbandingan dengan OPERATOR == atau !=
* */

fun main() {

    val company1 = Company("Kotlang")
    val company2 = Company("Programming")

    println(company1 == company2) // false tapi setelah EQUALS (milik class any) di override di class COMPANY jadi bernilai true (berdasarkan parameter NAME)
    println(company1 == company1) // true
    println(company2 == company2) // true
}