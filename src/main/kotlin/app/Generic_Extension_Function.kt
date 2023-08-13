package app

class Data<T>(val data: T)

fun Data<String>.printString(){
    val data: String = this.data
    println(data)
}

fun Data<Int>.printInt(){
    val data: Int = this.data
    println(data)
}

fun main() {
    val data1 = Data("Kotlin")
    val data2 = Data(1)

    data1.printString()
    data2.printInt()
}