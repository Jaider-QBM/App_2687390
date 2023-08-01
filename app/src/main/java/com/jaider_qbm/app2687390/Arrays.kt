package com.jaider_qbm.app2687390

class Arrays {
}

fun main() {
    /*val pets = arrayOf("dog", "cat", "canary")
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


     */

    //Reto 3 Automovil

    data class Auto (var marca: String, var modelo: String, var año: Int)

    val listaAutos = mutableListOf<Auto>()

    var i: Int = 1


    do{
        println("1. Registrar auto")
        println("2. Mostrar listado de autos")
        println("3. Buscar auto")
        println("4. Modificar auto")
        println("5. Eliminar auto")
        println("6. Borrar lista de autos")
        println("7. salir del programa")

        var op = readLine()!!.toInt()

        when(op){
            1->{
                println("Ingrese la marca del auto")
                val marca = readLine()!!.toString()

                println("Ingrese el modelo del auto:")
                val modelo = readLine()!!.toString()

                println("Ingrese el año del auto:")
                val año = readLine()!!.toInt()

                if (año < 0){
                    println("El año del auto no puede ser negativo")
                }
                else{
                    val newAuto= Auto(marca, modelo, año)
                    listaAutos.add(newAuto)
                    println("Registro exitoso")
                }
            }

            2->{
                if (listaAutos.isEmpty()){
                    println("La lista de autos esta vacia")
                }
                else{
                    println("Listado de autos")
                    listaAutos.forEachIndexed{ index, auto ->
                        println("${index+1} Marca ${auto.marca} Modelo ${auto.modelo} Año${auto.año}")
                    }
                }
            }

            3->{
                println("Ingrese la marca del auto a buscar")
                val buscarMarca = readLine()!!.toString()

                println("Ingresa el modelo del auto a buscar")
                val buscarModelo = readLine()!!.toString()

                val autoresult = listaAutos.filter { it.marca == buscarMarca && it.modelo ==buscarModelo}

                if (autoresult.isNotEmpty()){
                    println("Autos encontrados")
                    autoresult.forEach{auto ->
                        println("Marcar ${auto.marca} Modelo ${auto.modelo} Año ${auto.año}")
                    }
                }
                else{
                    println("No se encontraron autos con la marca ${buscarMarca} y el modelo ${buscarModelo}")
                }

            }

            4->{
                println("Ingrese la marca del auto a modificar")
                val modifiMarca = readLine()!!.toString()

                println("Ingrese el modelo del auto a modificar")
                val modifiModelo = readLine()!!.toString()

                println("Ingrese el año del auto a modificar")
                val modifiAño = readLine()!!.toInt()

                val autoresult = listaAutos.find { it.marca == modifiMarca && it.modelo == modifiModelo && it.año == modifiAño}

                if (autoresult != null){
                    println("Ingrese la nueva marca del auto ")
                    val newMarca = readLine()!!.toString()

                    println("Ingrese la nuevo modelo del auto")
                    val newModelo = readLine()!!.toString()

                    println("Ingrese el nuevo año del auto")
                    val newAño = readLine()!!.toInt()

                    if (newAño <0) {
                        println("El año no puede ser negativo ")
                    }
                    else{
                        if (listaAutos.any { it != autoresult && it.marca == newMarca && it.modelo == newModelo && it.año == newAño }){
                            println("Ya existe otro auto con la misma marca, modelo y año ")
                        }
                        else{
                            autoresult.marca == newMarca
                            autoresult.modelo == newModelo
                            autoresult.año == newAño

                            println("Auto modificado correctamente")
                        }
                    }
                }
                else{
                    println("No se encontro el auto para modificar")
                }
            }

            5->{
                println("Ingrese la marca del auto que quiere eliminar")
                val deleteMarca = readLine()!!.toString()

                println("Ingrse el modelo del auto que quiere eliminar")
                val deleteModel = readLine()!!.toString()

                println("Ingrese el año del auto que quiere eliminar")
                val deleteAño = readLine()!!.toInt()

                val autoResult = listaAutos.find { it.marca == deleteMarca && it.modelo == deleteModel && it.año == deleteAño }

                if (autoResult != null){
                    listaAutos.remove(autoResult)
                    println("Auto eliminado exitosamente")
                }
                else{
                    println("No se encontro el auto para eliminar")
                }
            }

            6->{
                listaAutos.clear()
                println("Lista de autos borrada exitosamente")
            }

            7->{
                println("Saliendo del programa")
                println("Desea volver a digitar 1.Si 2.No")
                i= readLine()!!.toInt()

            }
            else ->{
                println("Opcion invalida, por favor ingresa una opcion valida del 1-7")
            }


        }
    }
    while (i==1)

}