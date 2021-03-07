package com.rpedrozam.poo

import com.rpedrozam.poo.classpack.Phone
import com.rpedrozam.poo.classpack.Smartphone
import com.rpedrozam.poo.classpack.User

fun main(){

    println("\n === Classes ===\n")
    val phone: Phone = Phone(3164568521)
    phone.call()
    phone.showNumber()
    println(phone.number)

    println("\n=== Inheritance ===\n")
    val smartphone: Smartphone = Smartphone(3164568532, true)
    smartphone.call()
    smartphone.showNumber()

    val smartphone2: Smartphone = Smartphone(3164568532, false)
    smartphone2.call()
    smartphone2.showNumber()

    println("\n=== Data Class ===\n")
    val myUser = User (0, "Andres", "Perez", 0)
    println(myUser.component3())
    println(myUser)

}