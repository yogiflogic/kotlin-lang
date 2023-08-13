//varargs letaknya harus di paling akhir (paling kanan)
fun hitung(vararg values: Int):Int{
    var total = 0
    for(i in values){
        total += i
    }

    return total
}

fun main() {
    println(hitung(2,7,9,90))
}