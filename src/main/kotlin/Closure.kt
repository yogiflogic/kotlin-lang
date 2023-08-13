fun main() {

    var counter: Int = 0

    val lamdaIncrement: () -> Unit = {
        println("Lamda Increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)

}