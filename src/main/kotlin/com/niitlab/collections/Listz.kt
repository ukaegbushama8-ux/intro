package com.niitlab.collections

fun listz(){
    var fruits = listOf("Apple", "Banana", "Pear","Grapes","Strawberry")
    val mutableFruits = mutableListOf("Apple","Banana","Pear","Grapes")

    println(mutableFruits)

    for (fruit in fruits){
        println(fruit)
    }
}