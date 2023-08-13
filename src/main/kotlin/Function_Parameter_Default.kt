fun sayKotlin(firstname: String = "", lastName:String = "defaultLN", no : Int? = null ) {

    println("$firstname $lastName $no ")

}

fun main() {
//    tanpa parameter 1 dan 2 Tipe data String
    sayKotlin("","",97)

//    tanpa parameter ke 3 Integer
    sayKotlin("kot ","",)
//    Full Parameter
    sayKotlin("kotlin ","language ",46)
}