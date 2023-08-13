package data

// class Function -> file main Generic_Function

class Function(val name: String) {

    fun  <T> sayGeneric(param: T){
        println("Hello $name my name is $param ")
    }
}