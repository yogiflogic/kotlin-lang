package data
// class Customer -> file main Super_Constructor

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String,type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standard")
}

class PremiumCustomer : Customer{
//    pilih salah satu yang di perlukan
    constructor(name: String) : super(name,"Premium")
//    ini bagian mengakses SUPER CONSTRUCTOR di parent class
    constructor(name: String, type: String, balance: Long) : super(name, "Premium",balance)
}

// cara memanggil tanpa keyword SUPER pada SUPER CONSTRUCTOR ketika memiliki PRIMARY CONSTRUCTOR di sebuah class
// Ketika mengakses constructor pada class lain dan jika class child memiliki PRIMARY Construcktor maka secondarynya wajib mengakses
class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "Executive", balance){
    constructor(name: String) : this(name, 0)
}