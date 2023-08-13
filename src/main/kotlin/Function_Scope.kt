// function scope hanya bisa di panggil oleh function MAIN jika letaknya di dalam function main dan tidak bisa function tersebut di panggil di luar function main tersebut
fun main() {
    fun heyKot(){
        println("Hey Kotlin Come On")
    }

    heyKot()
}