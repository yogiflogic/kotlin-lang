package app

/*
* - poloymorphism -> berubah ke banyak bentuk -> dari satu object berubah ke bentuk yang lain
* - erat kaitanya dengan inheritance / wajib di inheritance kalau di java dan kotlin untuk mencapai polymorphism
* */

import data.Employee_Inheritance_Override
import data.Manager

fun main() {
    var employee: Employee_Inheritance_Override = Employee_Inheritance_Override("Kot Lang")
    employee.sayInheritance("Programming")

    employee = Manager("Pulau")
    employee.sayInheritance(" Kotlin")
}