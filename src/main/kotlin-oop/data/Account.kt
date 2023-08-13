package data
// - class Account -> file main Lazy_Properties
// - class Account -> file main Delegates_Observable

import kotlin.properties.Delegates


class Account(description: String = "") {
//    delegation properties with keyword lazy
//    bagian block lambda hanya di call 1 kali saja
    val name: String by lazy {
        println(" Delegation properties with keyword lazy")
        "Dele Lazy"
    }

// Delegates observable -> sebuah delegasi yang berfungsi untuk mendeteksi perubahan value awal dan value akhir pada properties
    var description: String by Delegates.observable(description){property, oldValue, newValue ->
        println("${property.name} is change from $oldValue to $newValue")
    }
}