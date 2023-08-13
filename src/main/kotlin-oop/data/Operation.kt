package data

// class Operation -> file main Sealed_Class


/*
* - sealed class secara otomatis menjadi abstract class
* - sealed class sangat cocok untuk di jadikan PARENT class untuk inheritance
* - Kapan digunkan? dan untuk kebutuhan apa? -> sealed class biasanya di gunakan untuk di kombinasikan dengan WHEN expression
* - Dengan sealed class kita bisa membatasi hanya class inheritancenya saja yang perlu di cek
*
* */

sealed class Operation(val name: String)

class Plus : Operation("Plus")
class Minus : Operation("Minus")