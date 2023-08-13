//faktorial recursive

fun main() {
    fun factorialLoop(values: Int): Int{
        var result = 1
        for (i in values downTo 1){
            result *= i
        }
        return result
    }
    println(factorialLoop(10))

    fun factoriaRecursive(values: Int):Int{
        return when(values){
            1 -> 1
            else -> values * factoriaRecursive(values - 1)
        }
    }

    println(factoriaRecursive(25))
}