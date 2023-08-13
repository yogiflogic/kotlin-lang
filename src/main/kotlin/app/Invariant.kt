package app
/*
* Invariant
* - Saat kita membuat Generic parameter type artinya invariant
* - Di kotlin generic tidak bisa melakukan invariant / melakukan hal seperti polymorphism
* - Tidak boleh di subtitut ke child atau pun sebaliknya
* */
class Invariant<T>(val data: T)

fun main() {
    val InvariantString = Invariant("Invariant")

//    tidak bisa bisa karna secara default terdetected invariant
//    val invariantAny : Invariant<Any> = InvariantString // invariant/polymorphism
//    invariantAny.data = 100


}