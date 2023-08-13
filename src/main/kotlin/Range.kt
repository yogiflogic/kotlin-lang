fun main() {
    val range = 1..1000

    val range2 = 1000 downTo 700
    val range3 = 1000 downTo 700 step 5

    println(range.count())
//    contains -> mengecek apakah ada nilai terseut
    println(range.contains(50))
    println(range.contains(2000))
    println(range.first)
    println(range.last)
    println(range3.step)
}