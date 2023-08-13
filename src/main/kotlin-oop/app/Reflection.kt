package app
// file main Reflection -> class Create_Product_Request
// file main Reflection -> class Not_Blank

/*
* RFLECTION
* - Dengan reflection kita bisa membuat library / framework karana kita bisa membaca meta data dari aplikasi/ program yang kita buat
* */

import annotations.Not_Blank
import data.Create_Product_Request
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validdateRequest(request: Any){
//    untuk mendapatkan informasi class yang mempunyai annotation
    val clazz = request::class
//    ambil semua data properties
    val properties = clazz.memberProperties

//    iterate satu per satu, lalu cek jika ada annotation yang blank
    for (property in properties){
        if (property.findAnnotation<Not_Blank>() != null){
//            call() ambil property / request
            val value = property.call(request)
            when(value){
                is String -> {
                    if ("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = Create_Product_Request("1","YZR-M1",15000)
    validdateRequest(request)
}