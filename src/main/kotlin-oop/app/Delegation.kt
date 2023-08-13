package app

// file main Delegation -> class Base

/*
* DELEGATION PATERN
* - Meneruskan properties dan function ke object lainnya
* - Kotlin mendukung pembuatan delegation secara otomatis
* */

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayDelegation("Delegation")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayDelegation("Delegation2")
}