package annotations
// class annotations.Fancy -> class program.MyApplication

/*
* - annotation class tidak bisa memiliki member (propeties dll)
* - annotation biasanya digunakan untuk membuat library / framework
* */

@Target(AnnotationTarget.CLASS)// cuma bisa di tambahkan di dalam class (isinya array bisa di tambahkan lebih dari 1)
@Retention(AnnotationRetention.RUNTIME)// hasilnya nya di compile masuk ke dalam binary tapi bisa di baca reflection
@MustBeDocumented // bisa di documentasikan untuk public API
annotation class Fancy(val author: String)