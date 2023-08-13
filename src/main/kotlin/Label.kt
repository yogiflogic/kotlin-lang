//untuk menentukan / tanda yang ter INTEGRASI pada keyword break , continue dan return

fun labelBreak(){

    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10){
            if (i > 5){
                break@loopI
            }
            println("$i * $j = ${ i * j }")

        }
    }

}

fun labelContinue(){
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI
            }
            println("$i * $j = ${ i * j }")

        }
    }
}

fun labelReturn(){
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@{
        if (it == "Lang"){
            return@test
        }else{
            println("Kotlin")
        }
    }
}

fun main() {

    labelBreak()


}