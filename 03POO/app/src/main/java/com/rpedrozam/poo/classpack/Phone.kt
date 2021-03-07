package com.rpedrozam.poo.classpack

open class Phone (val number: Long) {

    fun call(){
        println("Call...")
    }

    open fun showNumber(){
        println("The number is: $number")
    }
}