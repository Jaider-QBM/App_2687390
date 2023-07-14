package com.jaider_qbm.app2687390

class Ciclos {
}

fun main() {
    //for (i in 1..5) println(i)

    //forma desendente
    // for (i in 5 downTo 0) println(i)

    // for como salto
    //for (i in 1 ..10 step 2) println(i)

    //forma desendente con salto
    //for (i in 10 downTo 1 step 2) println(i)

    /*
    for (i in 1..10){
        var number:Int = i%2
        if (number==0){
            println("${i} el numero es par")
        }
        else {
            println("${i}el numero es inpar")
        }
    }
    */

    // Cuantos pares y inpares ahi
    /*
    var contadorP: Int = 0
    var contadorI: Int = 0

    for (i in 1..10){
        print("Ingrese 10 numeros")
        var numero = readLine()!!.toInt()
        var result: Int = numero%2

        if ( result==0){
            contadorP++
        }
        else{
            contadorI++
        }
    }

    println("El total de numeros pares son: ${contadorP} y numeros inpares son ${contadorI}")
     */


    // La suma de los pares y inPares

    /*
    var SumaP =0
    var SumaI =0

    for(i in 1..10){
        print("Ingrese 10 numeros")
        var numero = readLine()!!.toInt()
        var result: Int = numero%2
        if (result == 0){
            SumaP= numero+ numero
        }
        else{
            SumaI = numero + numero
        }
    }
    print("La suma de todos los pares es ${SumaP} y la suma de los inpares ${SumaI}")
     */

    // si el numero ingresado es 0 o menor que 0 se detiene el ciclo
    /*
    var sumaP =0
    var SumaP =0

    for(i in 1..3){
        print("Ingrese 10 numeros")
        var numero = readLine()!!.toInt()

        if (numero <=0 ){
            print("El se acabo el ciclo por que escribiste 0 o -0")
            break
        }
        else{
            println("Sigue el ciclo")
        }
    }
     */
    /*
    // Contadores
    var contadorP: Int = 0
    var contadorI: Int = 0

    // Acumuladores
    var SumaP: Int =0
    var SumaI: Int =0

    for(i in 1..3){
        println("Ingrese 10 numeros")
        var numero = readLine()!!.toInt()

        if (numero<=0){
            println("El se acabo el ciclo por que escribiste 0 o -0")
            break
        }
        else{
            var result: Int = numero%2
            if (result == 0){
                contadorP++
                SumaP= SumaP+ numero
            }
            else{
                contadorI++
                SumaI = SumaI + numero
            }

        }
    }

     */

    /*
    // Contadores
    var contadorP: Int = 0
    var contadorI: Int = 0

    // Acumuladores
    var SumaP: Int =0
    var SumaI: Int =0

    var decion: Int = 1

    while (decion==1){
        println("Ingrese un numero")
        var numero = readLine()!!.toInt()

        if (numero<=0){
            println("El se acabo el ciclo por que escribiste 0 o -0")
            break
        }
        else{
            var result: Int = numero%2
            if (result == 0){
                contadorP++
                SumaP= SumaP+ numero
            }
            else{
                contadorI++
                SumaI = SumaI + numero
            }

        }

        println("Desea ingresar otro numero ")
        println("1. Si")
        println("2. No")
        decion = readLine()!!.toInt()
    }

    println("La suma de todos los pares es ${SumaP} y la suma de los inpares ${SumaI}")
    println("El total de numeros pares son: ${contadorP} y numeros inpares son ${contadorI}")

     */

    // Contadores
    var contadorP: Int = 0
    var contadorI: Int = 0

    // Acumuladores
    var SumaP: Int =0
    var SumaI: Int =0

    var decion: Int
    do {
        println("Ingrese un numero")
        var numero = readLine()!!.toInt()

        if (numero<=0){
            println("El se acabo el ciclo por que escribiste 0 o -0")
            break
        }
        else{
            var result: Int = numero%2
            if (result == 0){
                contadorP++
                SumaP= SumaP+ numero
            }
            else{
                contadorI++
                SumaI = SumaI + numero
            }

        }
        println("Desea ingresar otro numero ")
        println("1. Si")
        println("2. No")
        decion = readLine()!!.toInt()
    }while (decion==1)
    println("La suma de todos los pares es ${SumaP} y la suma de los inpares ${SumaI}")
    println("El total de numeros pares son: ${contadorP} y numeros inpares son ${contadorI}")

}