package app
// file main Abstract_Properties_&_Function ->class Animal

import data.Cat
import data.Dog

/*
*- ketika membuat properties dan function abstract kita tidak perlu menginisiali bodynya kalau di function atau di properties tidak perlu di inisialisas valuenya
*- mendefenisikan bodynya harus di class childnya
*- pada class childnya wajib di inisialisasi properties atau functionya
*- dengan kita membuat function dan properties yang abstract di class abstract parentnya , maka kita akan memaksa bahwa turunannya harus menginisialisasikannya
*  */

fun main() {
    val cat = Cat()
    cat.run()

    val dog = Dog()
    dog.run()
}