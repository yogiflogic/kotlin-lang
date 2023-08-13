package app
// file main Anonymous Class -> Interface Action

import data.Action

fun fireAction(action: Action){
//    Penggil function action di interface Action
    action.action()
}

class SampleAction : Action {
    override fun action() {
       println("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction())

//    cara memanggil anonymous function dengan keyword object
    fireAction(object : Action {
        override fun action() {
            println("Action one")
        }
    })

    fireAction(object : Action {
        override fun action() {
            println("Action two")
        }
    })
}