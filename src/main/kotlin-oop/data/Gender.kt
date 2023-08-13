package data
// class Gender -> file main Enum_Class

//enum class Gender {
//    MALE,FEMALE
//}

// enum dengan properties (constructor)
enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun description(){
        println(description)
    }
}