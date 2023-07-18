package com.reychellv.ejercicios.Condicionales

import kotlin.math.pow

class Ejercicio3 {
}

fun main(){
    //Condicionalkes Simples
    /*print("Ingrese un número: ")
    var n1:Int= readLine()!!.toInt()
    if (n1<10){
        print("Usted ganó.")
    }*/

    //Condicionales Anidados

    /*print("Ingrese una fruta: ")
    var fruit:String= readLine().toString().lowercase()

    if (fruit=="manzana"){
        print("Ingrese el color de la manzana: ")
        var color:String= readLine().toString()
        if (color=="rojo"){
            println("Puede comerla.")
        }else if(color=="verde"){
            println("Manzana para ensalada.")
        }else{
            println("Ese color no existe.")
        }
    }else if(fruit=="fresa"){
        print("Ingrese el tamaño de la fresa: ")
        var size:Double= readLine()!!.toDouble()

        if(size<15){
            println("Fresa pequeña.")
        }else if(size>15){
            println("Fresa Grande.")
        }
    }else if(fruit=="uva"){
        print("Ingrese el tipo de uva: ")
        var type:String= readLine().toString().lowercase()

        if(type=="chilena"){
            println("La libra cuesta $10.000.")
        }else if(type=="nacional"){
            println("La libra cuesta $8.000.")
        }else{
            println("Por el momento no disponemos de ese tipo de uva.")
        }
    }else{
        println("Por el momento no disponemos de esa fruta.")
    }*/
    //Condicionales Multiples

    //rangos
    //print("Ingrese un número: ")
    /*var n1:Int= readLine()!!.toInt()
    if(n1 in 1..10){
        println("El número ${n1} está dentro del rango.")
    }else{
        println("EL número ${n1} no está dentro del rango.")
    }

    print("Ingrese una letra: ")
    var letter:String= readLine().toString().lowercase()

    if(letter in "a".."u"){
        println("Es una vocal.")
    }else{
        println("no es una vocal.")
    }

    //rango decreciente
    var char= "a" downTo("u")

    //rango saltante
    var n2=1..10 step 2
    */

    /*print("Ingrese su edad: ")
    var age:Int= readLine()!!.toInt()

    if (age in 0..14){
        println("Usted está muy péqueño para estar en estos sitios.")
    }else if(age in 15..17){
        println("Usted es menor de edad. No puede ingresar.")
    }else if(age in 18..100){
        println("Usted es mayor de edad. Bienvenido.")
    }else{
        println("La edad ingresada es inválida.")
    }*/

    //Condicional when
    /*var result:Int=(1..50).random()

    when(result){
        0-> println("No hay resultado")
        1,2,3,4,5,6-> println("El resultado está entre 1 y 6")
        in 7..50-> println("El resultado está entre 7 y 50")
        else-> println("Fuera de rango.")
    }*/

    //Calculadora

    print("Ingrese el número 1: ")
    var n1:Double= readLine()!!.toDouble()
    print("Ingrese el número 2: ")
    var n2:Double= readLine()!!.toDouble()

    print("Ingrese la opción dependiendo la operación que desea realizar: \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Potenciación\n\nSu opción: ")
    var oper:Int= readLine()!!.toInt()

    when(oper){
        1->print("El resultado de la suma de los números ${n1} y ${n2} es: ${n1+n2}")
        2->print("El resultado de la resta de los números ${n1} y ${n2} es: ${n1-n2}")
        3->print("El resultado de la multiplicación de los números ${n1} y ${n2} es: ${n1*n2}")
        4->print("El resultado de la división de los números ${n1} y ${n2} es: ${n1/n2}")
        5->print("El resultado del número ${n1} elevado a la potencia de ${n2} es: ${n1.pow(n2)}")
        else->print("Esa opción es inválida.")
    }

}