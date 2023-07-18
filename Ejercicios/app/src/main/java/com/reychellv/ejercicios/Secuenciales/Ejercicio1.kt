package com.reychellv.ejercicios.Secuenciales

class RetoI {

}

fun main(){
    //programa que convierte grados fahrenheit a grados centigrados
    println("¡Bienvenida Abuelita! Aquí podrás convertir los grados Fahrenheit a grados Centígrados para que puedas hacer tu torta.")

    print("Ingresa los grados Fahrenheit: ")
    var gradosF=readLine()!!.toDouble()

    val gradosC=(gradosF-32)/1.8

    println("Abuelita, los ${gradosF} °F son equivalentes a ${gradosC} °C ¡Ya puedes hacer tu torta!")
    println("Hasta luego.")

}