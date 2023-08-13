package data

// Application -> file main singleton_object

/*
* - Singleton_Object di buat dengan keyword object (cara membuat sama seperti membuat class biasa)
* - Singleton_Object   adalah object yang hanya di buat 1 kali
* - Singleton_Object  tidak memiliki CONSTRUCTOR
* - Singleton_Object  biasanya di gunakan untuk membuat helper class atau utility class
* - Inner Object tidak bisa mengakses data di class outer classnya
* */


object Utilities {
    val name: String = "My Utilities"
    fun toUpper(value: String): String{
        return value.uppercase()
    }
}
