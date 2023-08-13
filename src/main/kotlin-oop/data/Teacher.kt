package data

// class Teacher -> file main Visibility_Modifier

/*
* internal hanya untuk hak akses di satu project yang sama
* */

open class Teacher(val name: String) {
    private fun teach(){
        println(" fun Teach Modifier")
    }

    open protected fun test(){
        println("Test Protected")
    }
}

class SuperTeacher(name: String) : Teacher(name){

    override public fun test(){
        super.test()
    }
}