package data2
// class Application2 -> file main Type_Alias

class Application(val name: String) {

    //  inner object
    object Utilities{
        fun toUpper(value: String) : String {
            return value.uppercase()
        }
    }

    companion object{
        fun toLower(value: String) : String {
            return value.lowercase()
        }
    }

}