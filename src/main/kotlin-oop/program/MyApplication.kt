package program
//class program.MyApplication -> file main Annotation

import annotations.Fancy

@Fancy(author = "KotLang")
class MyApplication(val name: String, val version: Int) {

    fun  info() : String = "Application $name-$version"

}