package com.jaider_qbm.app2687390

class introduccion {
}

fun main() {
    /*var long : Long= 1231
    var int: Int = 12345698
    var short: Short = 1236
    var Byte : Byte = 123

    print("los tipos de enteros son \n long ${long} \n tipo int${int}")*/

    print("Ingrese su nombre \n")
    var name = readLine()

    print("Ingrese su apellido \n")
    var lastname = readLine()

    print("Ingrese su edad \n")
    var edad: Int = readLine()!!.toInt()

    println("Su nombre es \n${name} \nSu apellido \n${lastname} \nSu edad \n${edad} ")
}