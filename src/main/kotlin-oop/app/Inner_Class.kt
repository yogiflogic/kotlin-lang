package app
// file main Inner_Class -> class Boss

/*
* - Di kotlin secara default tidak ada hubungan antara class OUTER class dengan Inner class , keduanya tidak bisa saling mengambil data
* - Jika ingin mengakses atributnya / propertiesnya / agar saling terhubung kita bisa gunakan keyword INNER di awal classnya pada INNER CLASS (class bagian dalam)
* - Gunakan this@namacclass untuk mengambil atribut class outternya -> ${this@Boss.name}
* */

import data.Boss

fun main() {
    val boss = Boss("BOSS Outer")

    val employee = boss.Employee("Inner EMPLOYESS")

   employee.hi()
}