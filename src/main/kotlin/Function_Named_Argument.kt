fun fullNameKotlin(firstName: String, middleName: String, lastName: String ){
    println("$firstName $middleName $lastName")
}

fun main() {

//    NAMED argument harus mention nama parameter aslinya
    fullNameKotlin(middleName = "Programming",
                    lastName = "Languange",
                    firstName = "Kotlin")
}