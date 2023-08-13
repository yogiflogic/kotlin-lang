fun main() {

//    keyword break -> akan memberhentikan KONDISI yang telah di tentukan
    var x = 0
    var y = 100

    while (x < y){

        println("Index ke : $x ")
        x++

        if ( x == 80){
            println("Index ke : $x ")
            break
        }
    }
println("=============================================")

//    keyword continue -> keyword yang akan menSKIP KONDISI yang di beri keyword continue
    for (i in 1..10){

        if (i % 2 == 0){
//            println("genap $i")
            continue
        }
        println("Ganjil $i :")
    }

}