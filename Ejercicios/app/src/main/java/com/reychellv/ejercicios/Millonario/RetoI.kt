package com.reychellv.ejercicios.Millonario

class RetoI {
}

fun main(){
    //edasd cliente
    println("Ingrese su edad: ")
    var age:Int= readLine()!!.toInt()

    //si el cliente tiene entre 0 y 4 años úiede entrar gratis
    //si es mayor que 4 y menor q2ue 18 debe pagar 20mil
    //si tiene entre 18 y 60 debe pagar 15mil
    //si es mayor de 60 solo paga 3mil

    when(age){
        in 0..4-> print("Bienvenido. Puede entrar gratis.")
        in 5..17-> print("Bienvenido. Debe pagar $20.000.")
        in 18..60->print("Bienvenido. Debe pagar $15.000.")
        in 61..100->print("Bienvenido. Debe pagar $3.000.")
        else->print("La edad es inválida.")
    }
}