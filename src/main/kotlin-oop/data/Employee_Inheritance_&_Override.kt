package data

// class Employee_Inheritance_&_Override -> file main Inheritance_Override

/*
* Inheritance
* - Pada kotlin saat membuat class defaultnya sebuah class di representasikan sebagai FINAL
* -  agar class bisa di turunkan beri keyword OPEN pada parent class
* - agar class chil bisa menerima inheritance  (pewarisan dari class parentnya) gunakan tanda titik dua (:)
* - Pada kotlin Inheritance hanya bisa di lakukan dari 1 parent ke banyak child
* - Saat class child melakukan Inheritancce dari class parent, Jika class parent memiliki parameter, maka di class child HARUS di representasikan juga parameternya
* */

/*
* Function Override
* - Pada kotlin pada dasarnya function juga di representasikan sebagai FINAL
* - Agar function bisa di ubah pada class turunannya (Inheritance Child) berikan keyword OPEN pada function di parentnya
* - Untuk mengubah / mengedit isi function (dalam body)  pada class child, berikan kewyword OVERRIDE pada awal function
* - Di Kotlin ketika kita melakukan OVERRIDE , yang bisa di ubah pada class child hanya isi yang ada di body functionya saja dan parameternya tidak bisa di ubah
*
* Child Class
* - Secara default pada class child yang sudah di override statusnya adalah OPEN (kebalkan dari parent)
* - Jika sebuah class child menjadi parent dari clash child inheritancenya/ clash child yang lain maka clash child tersebut secara dafault functionya sudah bersifat OPEN (kebalikan dari parent paling awal) dan bisa lansung melakukan OVERRIDE
* - Beri keyword FINAL jika clash child yang menjadi parent tersebut tidak ingin functionnya bisa di ubah / OVERRIDE oleh clash childnya / Inheritancenya yang lain
* */

open class Employee_Inheritance_Override(val name: String) {
    open fun sayInheritance(name: String){
        println("Halo $name, My Name is ${this.name}")
        println()
    }
}

open class Manager(name: String) : Employee_Inheritance_Override(name){
     final override fun sayInheritance(name: String){
        println("Halo $name, Yang di OVERRIDE di fun class Manager ${this.name}")
        println()
    }
}

class SuperManager(name: String) : Manager(name){
// eror karna function di parentnya menggunakan keyword FINAL dan tidak bisa di OVERRIDE
//    override fun sayInheritance(name: String){
//        println("Halo $name, Yang di OVERRIDE di fun class Manager ${this.name}")
//        println()
//    }
}

class vicePresident(name: String) : Employee_Inheritance_Override(name){
    override fun sayInheritance(name: String){
        println("Halo $name, Yang di ubah di fun class vicePresident ${this.name}")
        println()
    }
}