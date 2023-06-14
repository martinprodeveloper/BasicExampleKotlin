fun main() {

    // forlopp()
    // iterarColeccion()
    // iterarMap()
    // whileLoop()
    // doWhileLopp()
    loopAnidado()

}

fun forLopp() {

    // for loops
    // for(i in 1..4){ codigo a ejecutar }

    for (i in 1..4) {
        println("$i- Hola Mundo!")
    }

}

fun iterarColeccion() {

    // Iteración de colecciones

    val listaPersonajes = listOf("Spiderman", "Wolverine", "Ironman")

    for ((indice, personaje) in listaPersonajes.withIndex()) {
        println("$indice- $personaje")
    }

}

fun iterarMap() {

    // Iteración de maps

    val user = mapOf("name" to "Martin", "password" to "123")

    for ((key, value) in user) {
        println("$key: $value")
    }

}

fun whileLoop() {

    // While Lopp

    var numero = 1

    while (numero < 2) {
        println("Esta es una linea")
        numero = numero + 1
    }

}

fun doWhileLopp() {

    // do..while loop

    var suerte = 10

    do {

        println("Ingrese su número:")
        var numero = readLine()!!.toInt()

        if (numero > suerte) {
            println("Tu número es muy alto")
        }
        if (numero < suerte) {
            println("Tu número es muy bajo")
        }
        if (numero == suerte) {
            println("Ganaste!")
        }

    } while (suerte != numero)

}

fun loopAnidado() {

    // Lopps anidados

    for (i in 1..4){
        print("Fila $i: ")
        for (j in 1..4){
            print("$j")
        }
        println()
    }

}