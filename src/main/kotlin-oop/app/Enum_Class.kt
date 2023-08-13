package app
// file main Enum_Class -> class Gender

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGender: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGender.toList())
    println(manFromString)
    println(womanFromString)

    man.description()
    woman.description()
}