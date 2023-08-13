fun main() {

//    when expression
    val nilai = 'B'
//    cara ke-1
    when (nilai){
        'A' -> {
            println("Very Good")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        else -> {
            println("Very Bad")
        }
    }

//    when expression multiple option
    when (nilai){
        'A','B','C' -> {
            println("YOU WIN")
        }
        else -> {
            println("YOU LOSE")
        }
    }

//  when expression in
    val nilai2 = "A"
    val nilaiLulus : Array<String> = arrayOf("A","B","C")
    when (nilai2){
        in nilaiLulus -> println("Array You Win")
        !in nilaiLulus -> println("Try Again")
    }

//  when expression is
    val name = "Kotlin"
    when (name){
        is String -> println("Name is String TRUE")
        !is String -> println("Name Not String FALSE")
    }

//    When sebagai pengganti IF ELSE / when tanda variabel
    val nilaiTest = 90
    when {
        nilaiTest > 85 -> println("Very Good")
        nilaiTest > 79 -> println("Good")
        nilaiTest > 65 -> println("Not Bad")
        nilaiTest > 50 -> println("Bad")
        else -> println("Very Bad")
    }
}