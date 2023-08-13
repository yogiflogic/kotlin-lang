fun main() {
//   akses array string
    val member: Array<String> = arrayOf("Vale","Taro","MIR")
//    cara mengambil value di array
    val vale: String = member[0]
    val Taro: String = member.get(1)
    val MIR: String = member.get(2)
//    mengubah value array string
    member.set(2,"Pecco")
    println(member)

//    akses array integer
    val angka: Array<Int> = arrayOf(10,1,3,7,4)
    println(angka[4])

//    akses array null
    val product: Array<String?> = arrayOfNulls(5)
    product[0] = "Kacamata"
    product[1] = "Lensa"
    product[2] = null
    product[3] = "kotak"
    product[4] = null

    println(product[0])
    println(product[2])
}