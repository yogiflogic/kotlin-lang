package app

/*
* Generic Constraint -> Untuk membatasi data/ generic parameter type yang boleh di input
* - Generic parameter typenya harus HARUS class turunananya (inheritance)
* - Jika ingin menggunakan lebih dari 1 constraint gunakan keyword where (where: T xxxx, T xxxx)
* */

interface CanSayConstraint {
    fun sayCons(name: String)
}

open class Employee

class Manager : Employee(){
    fun managerFun(name: String){
        println("Hello manager is $name")
    }
}

class VicePresident : Employee(), CanSayConstraint{
    override fun sayCons(name: String) {
        println("Heloo $name, I'm Vice President")
    }
}

// generic constraint
//class Company<T : Employee>(val employee: T)

// lebih dari 1 constraint
class Company<T>(val employee: T) where T : Employee, T : CanSayConstraint

fun main() {
//    val data1 = Company(Employee())
//    val data2 = Company(Manager())

    val data3 = Company(VicePresident())
    println(data3.employee.sayCons("paramater generic constraint"))
//    val data4 = Company("String") // error
}

