package data
// class Boss -> file main Inner_Class

class Boss(val name: String) {

    inner class Employee(val name: String){

        fun hi(){
            println("Hello $name , ini adalah Inner class ${this@Boss.name}")
        }
    }
}