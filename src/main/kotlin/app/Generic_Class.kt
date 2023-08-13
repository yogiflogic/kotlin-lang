package app

//file main Generic_Class -> class MyData

/*
*  GENERIC Class <type>
* - Array juga Termasuk Generic data
* - Generic class bisa di akses dimanapun di dlam class tersebut
* */

import data.MyData

fun main() {
    val  myDataString: MyData<String, Int> = MyData("Generic",100)
    myDataString.printData()

    val myDataInt = MyData(300,"Kotlin Interger generic")
    myDataInt.printData()
}