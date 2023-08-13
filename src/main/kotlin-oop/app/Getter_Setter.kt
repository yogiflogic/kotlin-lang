package app
// file main Getter_Setter -> class Note

/*
* - Getter dan Setter tidak di wajibkan untuk di deklarasikan semua di kotlin, pilih salah satu atau ke-duanya
* - Cocok untuk memanipulasi properties ketika Get atau Set sesuai kebutuhan
* - field mengacu ke title
* */

import data.BigNote
import data.Note

fun main() {
    val note = Note("Getter")
    println(note.title)

    note.title = ""
//    println(note.title)

    val bigNote = BigNote("Big Note Class")

    println(bigNote.bigTitle)
}