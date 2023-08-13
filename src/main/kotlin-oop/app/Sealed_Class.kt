package app

// file main Sealed_Class -> Operation

import data.Minus
import data.Operation
import data.Plus

fun Oper(value1 : Int, value2 : Int, operation: Operation) : Int{
    return when(operation){
        is Plus -> value1 + value2
        is  Minus -> value1 - value2
    }
}

fun main() {
    println(Oper(10,10,Plus()))
    println(Oper(10,100,Minus()))
}