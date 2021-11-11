package com.example.taller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
            Taller primera parte
         */
        // Validar si una persona es mayor o menor de edad
        // mayorEdad()

        // Presentar la tabla de multiplicar de n numero de forma ascendente y descendente
        // tablaMultiplicar()

        // Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos
        // proyectos()

        // propiedades de un vehículo
        // clase()

        /*
            Taller segunda parte
         */
        // Ordenas los números
        // orden()

        // Validar la cédula
        validarCedula()

    }
    /*
        Taller primera parte
     */

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
        var x = 4
        var y = 5
        val estudiantes= arrayListOf<String>()
        val primerGrupo= arrayListOf<String>()
        val segundoGrupo= arrayListOf<String>()
        estudiantes.addAll(listOf("Joan", "Jeferson", "Jordy", "David", "Frank", "Shomira", "Luis",
            "Ricardo", "Andrés"))

        while (x >= 0){
            primerGrupo.add(estudiantes[x])
            x-=1
        }
        println("Primer Grupo: ${primerGrupo.sorted()}")

        while (y < 10){
            segundoGrupo.add(estudiantes[y])
            y+=1
        }
        println(" Segundo Grupo: ${segundoGrupo.sorted()}")
    }

    private fun clase(){
        val vehiculo = Carro(name = "Chevrolet", age=2015, arrayOf(Carro.Motor.DIESEL),
            arrayOf(Carro.Traccion.AWD), arrayOf(Carro.Capacidad.Cinco) )

        println("El vehículo "+vehiculo.name + "del año:" +vehiculo.age)
        vehiculo.tipoMotor()
        vehiculo.tipoTraccion()
        vehiculo.tipoCapacidad()
    }

    /*
        Taller segunda parte
     */
    private fun orden(){

        val numeros = intArrayOf(8, 3, 4, 1, 2, 6, 5, 7)

        for(x in  (0 until numeros.size-1)) {
            for(y in (0 until numeros.size-1)) {
                if(numeros[y] < numeros[y+1]) {
                    val tmp = numeros[y]
                    numeros[y] = numeros[y+1]
                    numeros[y+1] = tmp
                }
            }
        }
        for (x in numeros){
            println(x)
        }
    }

    private fun validarCedula(){
        var cedula = intArrayOf(1,1,5,0,0,6,5,3,9,7)
        var validar = intArrayOf(2,1,2,1,2,1,2,1,2)
        var cont = 0
        var suma = 0
        for (x in validar){
            var res = x * cedula[cont]
            cont += 1
            if (res > 9){
                var aux1 = res.toString()
                res = Character.getNumericValue(aux1.get(0)) + Character.getNumericValue(aux1.get(1))
            }
            suma += res
        }
        if (cedula[9] == (suma % 10) || cedula[9] == 10 - (suma % 10)){
            println("La cédula  es correcta")
        }else{
            println("La cédula no es correcta")
        }
    }
}