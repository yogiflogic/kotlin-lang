package data
// class Application -> file main singleton_object
// Application -> file main Type_Alias

/*
* - companion object harus berda di dalam class
* - companion object cocok untuk membuat class yang namanya sama dengan nama singleton object
*
*  */

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