package data
// class MyData -> file main Generic_Class

class MyData<T, U> (val firstData: T, val secondData: U) {

    fun getData(): T = firstData

    fun getSecond(): U = secondData

    fun printData(){
        println("Data is $firstData And $secondData")
    }
}