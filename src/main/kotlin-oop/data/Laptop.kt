package data

// class Laptop -> file main Any_Class

/*
*- Apapun class yang di buat , pada akhirnya super parent classnya adalah ANY CLASS
*- Jika menemukan function yang parameternya any , kita bisa memasukan class apappun parameter tersebut
*
* */

class Laptop(val name: String)

open class Handphone(val name: String)

class SmartPhone(name: String, val os: String) : Handphone(name)