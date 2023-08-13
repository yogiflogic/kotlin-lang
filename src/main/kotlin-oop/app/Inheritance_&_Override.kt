package app

// file main Inheritance_Override -> class Employee_Inheritance_&_Override

import data.Manager
import data.vicePresident

fun main() {
    val manager = Manager("Inheritance di child")
    val vicePresident = vicePresident("Vice Child")
    manager.sayInheritance("function di parent")
    vicePresident.sayInheritance("Function Vice Di Parent")
}