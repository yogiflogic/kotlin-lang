package app

    fun swaping( a: Int , b: Int): Int {
        val temp = a
        val a = b
        val b = temp
        return b
    }

    fun main() {
        val data1 = intArrayOf(2,100,4,1,5,7,5,4,10,60,77)

// mengurutkan isi data array secara ASC
        for (i in data1.indices){
                println(data1.sortedArray()[i])
        }
val x = 1..100
        x.random()
// mengurutkan isi data array secara DESC
        println("=====================")
        for (i in data1.indices){
                println(data1.sortedArrayDescending()[i])
        }

        println("=====================")
        println(data1.size)

        println("=====================")
//        ternary operator condition
        val a = 9
        val b = 2
        if (a<b) println(true) else println(false)
    }