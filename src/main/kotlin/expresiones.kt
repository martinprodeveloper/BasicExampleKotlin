fun main() {

    // expresionifelse()
    // operadorcomparacion()
    // condicionalanidado()
    // expresionwhen()
    rangoprogresion()

}

fun expresionifelse() {

    // Expresión if y else

    var lluvia = false

    if (lluvia) {
        println("Debes usar un paraguas")
    } else {
        println("No necesitas usar un paraguas")
    }

}

fun operadorcomparacion() {

    // Operadores de comparación
    // <, <=, >, >=, !=, ==

    var edad = 18

    if (edad >= 18) {
        println("Usted es mayor de edad")
    } else {
        println("Usted es menor de edad")
    }

    var nombre = "Martin"

    if (nombre == "Martin") {
        println("Hola $nombre")
    } else {
        println("No eres esa persona")
    }

}

fun condicionalanidado() {

    // Condicionales anidadas

    var edad = 25
    var grupo = true

    if (edad >= 18) {
        println("Puede pasar por ser mayor de edad")

        if (grupo) {
            println("Ganaste un descuento por venir en grupo")
        } else {
            println("No recibiste descuento")
        }

    } else {
        println("No puede pasar por ser menor de edad")
    }

}

fun expresionwhen() {

    // Expresion when

    var x = 1

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")

        else -> {
            println("El número no es 1 ni 2")
        }

    }

    var semaforo = "rojo"

    when (semaforo) {
        "rojo" -> println("Debe detenerse")
        "verde" -> println("Puede continuar")
        "ambar" -> println("Precausión")

        else -> {
            println("El color no pertenece a un semaforo")
        }

    }

}

fun rangoprogresion() {

    // Rangos y progresiones

    var numero = 5

    if (numero in 5..20) {
        println("El número se encuentra entre el 5 y 20")
    }

    when (numero) {
        in 5..20 -> println("El número se encuentra entre el 5 y 20")
        in 30..40 -> println("El número se encuentra entre el 30 y 40")

        else -> {
            println("El número no se encuentra dentro del rango")
        }
    }

    var letra = "p"

    when (letra) {
        in "a".."m" -> println("La letra esta en la primera mitad del abecedario")
        in "n".."z" -> println("La letra esta en la segunda mitad del abecedario")

        else -> {
            println("Letra desconocida")
        }
    }

}