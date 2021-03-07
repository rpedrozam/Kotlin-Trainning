package com.rpedrozam.poo.classpack

class Smartphone (number: Long, private val isPrivate: Boolean): Phone(number){

    override fun showNumber() {
        if (isPrivate){
            println("Desconocido")
        }else{
            super.showNumber()
        }
    }

}