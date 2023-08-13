fun main() {
    val arr = arrayOf("vale","morbi","peco","Taro","MIR")
    
    for (rider in arr){
        println(rider)
    }

//    perulangan range value
    for (value in 1..10 step 2){
        println(value)
    }

//    perulangan dengan keyword downTo dan step
    for (i in 100 downTo 1 step 10){
        println(i)
    }

//  perulangan kombinasi range dengan array  pengambilan value array
    for (i in 0..arr.size -1){
        println("Index Ke - $i Rider : ${arr.get(i)}")
    }
}