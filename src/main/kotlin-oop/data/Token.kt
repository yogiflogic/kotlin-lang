package data
/*
* - syarat inline class harus ada 1 properties dan hanya 1 properties
* - solusi jika membutuhkan 1 properties dan kalau hanya membutuhkan 1 object
* - jika terlalu banyak kita membuat class , nantinya akan terlalu banyak konsumsi memori
* */

inline class Token(val value: String){
    fun toUpper() : String = value.uppercase()
}
