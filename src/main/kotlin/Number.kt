fun main() {
    //  underscore in number
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100_000_000L

    // floating point number
    var value: Float = 90.98F
    var radius: Double = 2342342343.54535

    // Literal
    var decimaLiteral : Int = 100
    var hexadecimalLiteral : Int = 0xFF
    var binaryLiteral : Int = 0b0001


    println(height)
    println(balance)

    //  conversion
    var number: Int = 100

    var byte: Byte = number.toByte()
    var double: Double = number.toDouble()

    println(double)
}