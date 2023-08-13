package data
// class Fruit -> file main Comparable_Interface

class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
       return quantity.compareTo(other.quantity)
       return quantity.plus(other.quantity)
    }

}