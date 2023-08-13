package data
// class Shape -> file main Properties_Overriding
// class Shape -> file main Super_Keyword

/*
* Properties Overriding
*- secara default properties pada class di representasikan dengan keyword FINAL
*- pada kotlin jika ingin melakukan PROPERTIES OVERRIDING pada class child di class parentnya harus menggunakan keyword OPEN di propertiesnya
*- setelah memberi keyword OPEN pada properties parentnya, beri keyword overriding pada class childnya
*- secara default pada class child yang propertiesnya sudah di override, keyword propertiesnya adalah OPEN, jika class child tersebut memiliki inheritance
*- ketika sebuah class child menjadi parent dari clash child turunannya, secara default keyword pada propertiesnya bisa lansung di override karena keyword parentnya secara default adalah OPEN
* - jika ingin menutup akses properties override pada clash child yang jadi parennyanya , maka gunakan keyword final pada properties clash child yang sudah menjadi parent terhadap class child turunannya
* */

/*
* Super Keyword
* - keyword SUPER berfungsi untuk mengakses properties atau function PARENT class
* - hanya bisa untuk mengakses 1 parent di atasnya saja
* */

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("This is class Shape")
    }
}

open class Retangle : Shape() {
    final override val corner: Int = 4
//    keyword SUPER yang di gunakan untuk mengkases properties di class PARENT
    val parentCorner: Int = super.corner

    override fun printName(){
        println("This class Retangle")
        super.printName()
    }
}

class Triangle : Retangle() {
//    akses properties override di tutup dengan keyword final
//    override val corner: Int = 7
}