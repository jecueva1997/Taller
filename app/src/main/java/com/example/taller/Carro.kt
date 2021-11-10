package com.example.taller


class Carro(val name: String, val age: Int, val motor: Array<Motor>, val traccion: Array<Traccion>,
            val capacidad: Array<Capacidad>) {
    enum class Motor{
        DIESEL,
        GASOLINA,
        HIBRIDO
    }

    fun tipoMotor(){
        for (motor in motor){
            println("Tiene el siguiente motor: "+motor)
        }
    }

    enum class Traccion{
        AWD,
        FWD,
        RWD
    }

    fun tipoTraccion(){
        for (traccion in traccion){
            println("Tiene la siguiente tracción: "+traccion)
        }
    }

    enum class Capacidad{
        Cuatro,
        Cinco,
        Seis
    }

    fun tipoCapacidad(){
        for (capacidad in capacidad){
            println("Capacidad para: "+capacidad + " personas")
        }
    }
}

