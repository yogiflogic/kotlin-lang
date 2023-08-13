//tambahkan keyword tailrec akan di ubah seakan-akan jadi looping
fun main() {
    tailrec fun display(values: Int) {
        println("Recursive $values")
        if (values > 0){
            display(values -1)
        }
    }

    tailrec fun factoriaRecursive(values: Int, total: Int = 1):Int{
        return when(values){
            1 -> total
            else -> factoriaRecursive(values - 1, total * values)
        }
    }

    println(factoriaRecursive(10))
}