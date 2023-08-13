fun main() {
    fun heyHeyKot(name: String = ""): String {
        return if (name == ""){
            "Hello Kotlin"
        }else{
            "Hello $name"
        }
    }

    println(heyHeyKot())
    println(heyHeyKot("Programming"))

    fun heyKot(name: String = ""): String{
        return when(name){
            "" -> "Hello Kotlin Programming Language"
            else -> "Helo $name"
        }
    }

    println(heyKot())
    println(heyKot("Programmer Kotlin"))
}