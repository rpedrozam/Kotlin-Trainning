package com.rpedrozam.fundamentals



fun main(){

    println("Hello World")

    newTopic("Excecute my first function")

    newTopic("Variables and constants")

    val a = 2
    val b = "String"
    val c = true

    var d = 2
    var e = "String"
    var f: Boolean = true

    //? allow to set null to variable
    var objNull: String?
    objNull = null

    //Variable with any type of data
    var objAnyType: Any?
    objAnyType = null

}

//My first function
fun newTopic( topic: String) {
    println("===== $topic ====")
}