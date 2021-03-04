package com.rpedrozam.fundamentals

fun main(){
    sayHello()
}

private fun sayHello() {

    println("Hello world")
    println( "The add result is: ${add(2, 5)}")
    println( "The substract result is: ${substract(2, 5)}")
}

private fun add (num1: Int, num2: Int): Int{
    return num1 + num2
}

private fun substract (num1: Int, num2: Int) = num1 - num2
