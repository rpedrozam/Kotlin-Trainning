package com.rpedrozam.poo

import com.rpedrozam.poo.classpack.Phone
import com.rpedrozam.poo.classpack.Smartphone

fun main(){

    println("\n === Classes ===\n")
    val phone: Phone = Phone(3164568521)
    phone.call()
    phone.showNumber()
    println(phone.number)

    println("\n=== Herencia ===\n")
    val smartphone: Smartphone = Smartphone(3164568532, true)
    smartphone.call()
    smartphone.showNumber()

    val smartphone2: Smartphone = Smartphone(3164568532, false)
    smartphone2.call()
    smartphone2.showNumber()

    println("\n=== Override ===\n")



}