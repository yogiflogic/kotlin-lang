package data
// class Animal -> file main Abstract_Properties_&_Function

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat : Animal() {
    override val name: String = "Cat Class"

    override fun run() {
        println("Cat Fun Run")
    }
}

class Dog : Animal() {
    override val name: String = "Dog Class"

    override fun run() {
        println("Dog Fun Run")
    }
}