package com.jaider_qbm.app2687390
import java.util.Random
class Nequi {
}

fun main() {

    var number: String? = ""
    var pass: String? = ""
    var sal: Int = 45000
    var tickets = false

    fun login(): Boolean {
        println("Acceso a la aplicación")
        println("Ingrese su número de celular:")
        number = readLine()
        println("Ingrese su clave de 4 dígitos:")
        pass = readLine()
        return true
    }

    fun showBalance() {
        println("Saldo Disponible: $sal COP")
    }

    fun generateCode(): String {
        val random = Random()
        return String.format("%06d", random.nextInt(1000000))
    }

    fun withdraw() {
        if (sal < 2000) {
            println("No te alcanza para hacer el retiro.")
            return
        }

        println("Selecciona una opción:")
        println("1. Cajero")
        println("2. Punto físico")

        val options = readLine()!!.toInt()

        when (options) {
            1, 2 -> {
                println("Ingrese el monto a retirar:")
                val amount = readLine()!!.toInt()

                if (amount > sal) {
                    println("No tienes suficiente saldo para hacer el retiro.")
                } else {
                    val code = generateCode()
                    println("Retiro exitoso. Código de retiro: $code")
                    sal -= amount
                }
            }

            else -> println("Opción inválida. Intente nuevamente.")
        }
    }



    fun sendMoney() {
        println("Ingrese el número de teléfono al que desea enviar dinero:")
        val recipient = readLine()!!.toString()
        println("Ingrese el valor a enviar:")
        val amountToSend = readLine()!!.toInt()

        if (amountToSend > sal) {
            println("No tienes suficiente saldo para enviar el dinero.")
        } else {
            sal -= amountToSend
            println("Envío exitoso. Se ha enviado $amountToSend COP al número $recipient.")
        }
    }

    fun recharge() {
        println("Ingrese el valor a recargar:")
        val rechargeAmount = readLine()!!.toInt()

        println("¿Desea realizar la recarga de $rechargeAmount COP? (Sí/No)")
        val confirmation = readLine()!!.toString()

        if (confirmation == "si" || confirmation == "SI" || confirmation == "Si") {
            sal += rechargeAmount
            println("Recarga exitosa. Su nuevo saldo es de $sal COP.")
        } else {
            println("Recarga cancelada.")
        }
    }

    fun payBill() {

        println("Ingrese el valor de la factura:")
        val billAmount = readLine()!!.toInt()

        println("¿Desea pagar la factura de $billAmount COP? (Sí/No)")
        val confirmation = readLine()?.trim()?.toUpperCase()

        if (confirmation == "si" || confirmation == "SI" || confirmation == "Si") {
            if (billAmount > sal) {
                println("No tienes suficiente saldo para pagar la factura.")
            } else {
                sal -= billAmount
                println("Pago de factura exitoso. Se ha descontado $billAmount COP de tu saldo.")
            }
        } else {
            println("Pago de factura cancelado.")
        }
    }

    fun recoverPassword() {
        println("Ingresa la nueva contraseña:")

        var recover = readLine()!!.toString()

        if (recover==null){
            println("No se digito la nueva contraseña")
        }
        else{
            println("Cambio de contraseña exitoso")
        }
    }



    fun process() {
        var op = true

        while (op) {
            println("\n Elige una opción:")
            println("1. Saca")
            println("2. Envía")
            println("3. Recarga")
            println("4. Pagar factura")
            println("5. Recuperar contraseña")
            println("6. Salir")

            val option = readLine()!!.toInt()

            when (option) {
                1 -> withdraw()
                2 -> sendMoney()
                3 -> recharge()
                4 -> payBill()
                5 -> recoverPassword()
                6 -> {
                    println("¡Gracias por usar Nequi! Hasta pronto.")
                    tickets = false
                    op = false
                    break
                }
                else -> println("Opción inválida. Intente nuevamente.")
            }
        }
    }


    println("¡Bienvenido a Nequi Colombia!")

    var loginAttempts = 3

    if (!tickets && loginAttempts > 0) {
        if (login()) {
            tickets = true
            showBalance()
            process()
        } else {
            println("¡Upps! Parece que tus datos de acceso no son correctos.")

            if (loginAttempts > 0) {
                println("Tienes $loginAttempts intentos más.")
            } else {
                println("Has agotado todos los intentos de acceso. Hasta pronto.")
            }
        }
    }
}