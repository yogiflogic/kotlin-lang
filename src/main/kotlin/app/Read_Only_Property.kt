package app

/*
* ReadOnlyProperty -> Generic class
*- Bisa di gunakan sebagai delegate dengan keyword (by)
* - sehingga sebelum data di kembalikan kita melakukan sesuatu hingga merubaha value dari property walaupun valuenya immutable (val)
* */

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


class LogReadOnlyProperty(val data: String): ReadOnlyProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        return data.uppercase()
    }

}

class NameWithLog(param: String){
//    delegation dengan keyword (by)
    val name: String by LogReadOnlyProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("Read Only Property")
    println(nameWithLog.name)
}