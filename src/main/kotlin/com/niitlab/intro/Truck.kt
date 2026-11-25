package com.niitlab.intro

import java.lang.IO.println

abstract class Truck : Drivable, Insured{
    override fun drive() {
        println("Drive the truck")
    }

    override fun park(){
        println("Park the truck")
    }
}