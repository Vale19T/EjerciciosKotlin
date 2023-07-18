package com.reychellv.ejercicios.Secuenciales

class RetoII {

}

fun main(){
    //programa que permite a una enfermera identificar la dosis correspondiente para cada bebe

    println("Bienvenida Enfermera. Aquí podrá registrar los datos del bebe y su padre. Asimismo podrá calcular la dosisi necesaria.")

    print("Ingrese su nombre: ")
    val nameN:String= readLine().toString().capitalize()
    print("Ingrese el nombre del bebé: ")
    val nameB:String= readLine().toString()
    print("Ingrese el nombre del padre: ")
    val nameP:String= readLine().toString()
    print("Ingrese el peso del bebé en Kg: ")
    val kg:Double= readLine()!!.toDouble()
    print("Ingrese la edad en meses del bebé: ")
    val months:Int= readLine()!!.toInt()

    //calculo
    var dosis=((kg+10)/(months*10))*8

    println("La dosis de vacuna necesaria para el bebé ${nameB} es de ${dosis}mL. ")
    println("El Padre de ${nameB} se llama ${nameP} y la enfermera que lo atendió fué ${nameN}.")
    println("Hasta luego.")


}