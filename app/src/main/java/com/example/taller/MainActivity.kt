package com.example.taller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Validar si una persona es mayor o menor de edad
        // mayorEdad()

        // Presentar la tabla de multiplicar de n numero de forma ascendente y descendente
        // tablaMultiplicar()

        // Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos
        proyectos()

        // propiedades de un vehículo
        // clase()
    }

    private fun mayorEdad(){
        val edad = 60


        if ( edad >= 18) {
            println("La persona con $edad es mayor de edad")
        }else{
            println("La persona con $edad es menor de edad")
        }
    }

    private fun tablaMultiplicar(){
        val n = 12
        for (x in 0..10){
            var multiplicar = x * n
            println(" Multiplicación Ascendente $n * $x = $multiplicar")
        }
        for (x in 10 downTo 0){
            var multiplicar = x * n
            println(" Multiplicación Descendente $n * $x = $multiplicar")
        }
    }

    private fun proyectos(){
        
    }

    private fun clase(){
        val vehiculo = Carro(name = "Chevrolet", age=2015, arrayOf(Carro.Motor.DIESEL),
            arrayOf(Carro.Traccion.AWD), arrayOf(Carro.Capacidad.Cinco) )

        println("El vehículo "+vehiculo.name + "del año:" +vehiculo.age)
        vehiculo.tipoMotor()
        vehiculo.tipoTraccion()
        vehiculo.tipoCapacidad()
    }
}