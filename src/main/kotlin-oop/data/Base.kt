package data

// class Base -> file main Delegation

interface Base {
    fun sayDelegation(name: String)
}

class MyBase : Base{
    override fun sayDelegation(name: String) {
        println("Say $name ")
    }
}

// DELEGATION cara manual
//class MyBaseDelegate(val base: Base) : Base {
//    override fun sayDelegation(name: String) {
//        base.sayDelegation(name)
//    }
//}

// DELEGATION cara otomatis (Masih bisa juga meng Override functionya) / base = implementasi dari class MyBase
class MyBaseDelegate(val base: Base) : Base by base

