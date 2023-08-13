package data
// class Interaction -> file main Interface

/*
* - interface bisanya di buat untuk kontrak properties dan function/ method , hampir sama dengan abstract class
* - class childnya wajib meng-override properties dan function di interfacenya
* - pengecualian di interface yang tidak harus abstract , buat concrete function (bisa buat body di function) interface
* - di interface tidak bisa menginisialisai properties tapi boleh membuat body (tidak sperti di class abstract) di functionnuya dan tidak harus mengoverride di clash childnya jika functionya sudah mempunyai body di interfacenya
* - Di interface boleh mewarisi (inheritance) lebih dari satu interface
* - Meskipun sebuah class mewarisi interface yang banyak , akan tetapi class tersebut masih bisa juga mewarisi class yang lain, dengan sayarat hanya 1 class saja
* - Di interface boleh melakukan inheritance (pewarisan) antar interface lebih dari satu , yang tidak bisa adalah ketika interface inheritance sebuah class
* */

interface Interaction {
    val name: String
    fun funInteraction(name: String) {
        println("Say Interface $name & ${this.name}")
    }
}

interface Go : Interaction {
    fun go(){
        println("go!")
    }
}

interface MoveA{
    fun move(){
        println("Move A")
    }
}

interface MoveB{
    fun move(){
        println("Move B")
    }
}

open class example()

class Human(override val name: String) : example(), Go , MoveA, MoveB{
//    mengatasi KONFLIK di interface
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}