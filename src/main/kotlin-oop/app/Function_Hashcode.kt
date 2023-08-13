package app
// file main FUNCTION HASHCODE -> class COMPANY

import data.Company

/*
* Hashcode
* - Hashcode Conversi untuk object menjadi angka/number
* - Salah satu penggunaanya untuk struktur data
* - Untuk memastikan tidak ada data duplikat
* - Cocok untuk penggunaan data unik
* - Saat meng-generate HASHCODE utnuk objectmirip pointer / lokasi di memorinya
* - Untuk mengubah implementasi hashcode bisa meng-overridenya
* - Hascode di gunakan untuk representasi number di kotlin
 */

fun main() {
    val company1 = Company("Kotlinn")
    val company2 = Company("Kotlin")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}