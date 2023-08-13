fun sum(x: Int, y: Int): Int{
    val z = x + y

    return z
}

fun bagi(x: Int, y: Int): Int {

// mendeklarasikan agar hasil bagi dengan NOL )  mengmbalikan value NOL )
    if (x == 0 || y == 0) {
        return 0
    }else{
        val z =  x / y
        return  z
    }

}

fun main() {
//    sum
    println(sum(85,15))

//    bagi
    println("Nol bagi nol = ${bagi(0,0)}")
    println("100 bagi nol = ${bagi(100,0)}")
    println("100 bagi 2 = ${bagi(100,2)}")
}