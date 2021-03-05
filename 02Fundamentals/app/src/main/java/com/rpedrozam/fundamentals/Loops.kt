package com.rpedrozam.fundamentals

fun main() {
    println("Loops")

    showPersons("Dog", "Cats", "Horse", "Cow")
    
}

fun showPersons( vararg persons: String){

    for (person in persons){
        println(person)
    }

    var index = 0
    while (index < persons.size){
        println(persons[index])
        index++
    }

    index = (persons.indices).random()
    when (persons[index]){
        "Cats" -> println("It's cat")
        "Dog" ->{
            println("It's dog multiline")
        }
        else -> {
            println("Others")
        }
    }
}
