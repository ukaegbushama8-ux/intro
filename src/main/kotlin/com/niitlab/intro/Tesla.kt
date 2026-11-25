package com.niitlab.intro

import java.lang.IO.println

class Tesla : Vehicle() {

    override fun startEngine() {
        println("Starting Tesla")
    }

    override fun fuelUp() {
        println("fueling Tesla")
    }

    override fun stopEngine() {
        println("Stopping Tesla")
    }

}