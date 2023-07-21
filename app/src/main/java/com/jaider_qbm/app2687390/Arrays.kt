package com.jaider_qbm.app2687390

class Arrays {
}

fun main() {
    val pets = arrayOf("dog", "cat", "canary")
    println(pets.contentToString())

    println(pets[1])

    //cambiar un elemento en un array

    pets[2]="parrot"
    println(pets.contentToString())

    //recorrer un array
    for (element in pets){
        println("La mascata es $element")
    }

    //Recorrer un array con posicion
    for ((index,element) in pets.withIndex()){
        println("La mascota en la posicion $index es $element")
    }

    //declare una lista usando listof() e imprimala. Listas inmutable no se puede cambiar

    val instrumens = listOf("trumpet", "piano", "violin")
    println(instrumens)

    println(instrumens[1])


    // declarar el tipo de dato

    val instrumentos: List<String> = listOf("trumpet", "piano", "Violin")
    println(instrumentos)


    //Listas mutables, que si se puede cambiar los datos

    val myList = mutableListOf("Trumpet", "piano", "Violin")
    println(myList)
    myList[2]="Guitar"

    println(myList)



    //RETO DE INVESTIGACION

    //¿como obtener el primer y el ultimo elemento  de una lista?
    val listaMutable: MutableList<String> = mutableListOf("Jaider", "Checho", "Johan", "Dilan", "Harold")

    // Obtener el primer elemento de la lista
    val primerElemento = listaMutable.first()

    // Obtener el último elemento de la lista
    val ultimoElemento = listaMutable.last()

    // Imprimir los resultados
    println("El primer elemento de la lista es: $primerElemento")
    println("El último elemento de la lista es: $ultimoElemento")


    //Como agregar elementos a una lista mutable

    listaMutable.add("Xelene")

    println(listaMutable)

    //Como quitar elementos a una lista mutable

    //remove(Elemento) elimina la primera ocurrencia del elemento especificado en la lista
    listaMutable.remove("Jaider")
    println(listaMutable)

    //removeAt(index) elimina el elemento en el indice especificado de la lista
    listaMutable.removeAt(2)
    println(listaMutable)

    //como buscar elementos a una lista mutable

    //Contains(elemento)
    val contieneElement = listaMutable.contains("Johan")
    println("la lista contiene el elemento $contieneElement")

    //indexOf(Elemento)

    val elemento = listaMutable.indexOf("Xelene")
    println("El indice del elemento xelene es: esta ubicada en la posicion $elemento")




}