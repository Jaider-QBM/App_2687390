package com.jaider_qbm.app2687390

class condicionales {
}

fun main() {
    /*print("Ingrese un numero \n")
    var numero: Int = readLine()!!.toInt()

    print("Ingrese otro numero \n")
    var numero2: Int = readLine()!!.toInt()

    if(numero > numero2){
        print("el primer numero que ingreso es mayor que el segundo")
    }
    else if(numero == numero2){
        print("Los numeros son iguales")
    }
    else {
        print("El segundo numero ingrasado es mayor")
    }

     */
    // generar un numero aleatorio
    /*var aleatorio = (1..20).random()*/

    //variables con condicion con rango
    /*
    println("Ingrese un numero 1 a 20")
    var numero : Int = readLine()!!.toInt()

    if (numero in 1..20){
        print("El numero esta en el rango")
    }
    else {
        print("Te dije un numero del 1 al 20")
    }
     */

    /*var numAleatorios = (0..50).random()

    when(numAleatorios){
        0 -> println("No hay concidencias y el numero es ${numAleatorios}")
        in 1..10 -> println("Hay 10 condicencias y el numero es ${numAleatorios}")
        in 20..50 -> println("Hay muchas condidencias y el numero es ${numAleatorios}")
    }*/

    /*RETO 1

    var dado1 = (1..6).random()
    var dado2 = (1..6).random()

    if (dado1 ==1 && dado2==1){
        print("Ganaste con pardar de unos")
    }
    else if (dado1 ==2 && dado2 == 1 || dado2 == 2 && dado1 == 1) {
        print("Ganaste con total de tres en los dados")
    }

    else if (dado1 ==6 && dado2 == 5 || dado1 == 5 && dado2 ==6){
        print("ganaste con un total de once en los dados")
    }
    else if(dado1 == 1 && dado2 == 1 || dado1 == 12 && dado2 == 12){
        print("ganaste dos o dace en los dados ")
    }
    else if( dado1 + dado2 == 7){
        print("ganaste un total de siete en los datos")
    }
    else {
        print("Perdio")
    }
     */

     var descuento =(1..4).random()

    println("Ingrese el valor de su compra")
    var compra = readLine()!!.toInt()
    if(compra > 50000 && descuento == 1){
        var descuentor: Float =0.10F
        var roja =compra*descuentor
        var total = compra-roja
        print("Saco la bolita roja obtiene 10% en el valor de tu compra y esto es el total ${total.toInt()}")
    }
    else if(compra > 50000 && descuento == 2){
        var descuentoa: Float =0.30F
        var azul =compra*descuentoa
        var total= compra-azul
        print("Saco la bolita azul obtiene 30% en el valor de tu y esto es el total ${total.toInt()}")
    }
    else if(compra > 50000 && descuento == 3){
        var descuento: Float =0.50F
        var amarilla =compra*descuento
        var total = compra-amarilla
        print("Saco la bolita amarrilla obtiene 50% en el valor de tu compra y esto es el total ${total.toInt()}")
    }
    else if(compra > 50000 && descuento == 4){
        print("Saco la bolita blanca te llevas tu compra gratis ")
    }
    else {
        print("no obtienes ningun descuento ")
    }
}