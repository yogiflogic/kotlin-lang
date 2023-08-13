package app

import java.time.Year
import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param){

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }

}

class Car(brand: String, year: Int){
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
//    tanpa membuat class panjang seperti di atas
    var owner: String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable(""){property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable(""){property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    val car = Car("Yamaha",2004)

    car.brand = "Ducati"
    println(car.brand)

    car.year = 2007
    println(car.year)

    car.owner = "Vale"
    println(car.owner)

    car.description = "Semakin Di Depan"
    println(car.description)

    car.other = "Other Delegation"
    println(car.other)
}