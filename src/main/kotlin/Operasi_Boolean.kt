fun main() {
    val  nilaiUjian = 90
    val nilaiAbsen = 70

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75

//    val apakahLulus = apakahLulusAbsen && apakahLulusUjian
//    val apakahLulus = apakahLulusAbsen || apakahLulusUjian
      val apakahLulus = apakahLulusAbsen != apakahLulusUjian
    println(apakahLulus)
}