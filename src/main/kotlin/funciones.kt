fun main() {

    // Creando y llamando a una función

    // saludo()
    // multiplicacion(2, 3)

    // saludos(nombre = "Martin", apellido = "Estupiñan")
    // saludos(nombre = "Martin")

    // var sumar = suma(15, 10)
    // println(sumar)

    // println(multiplicacionAnonima(5, 5))

    println(multiplicacionLambda(5, 10))

}

fun saludo() {

    println("Saludos esto es una función")

}

fun multiplicacion(numero1: Int, numero2: Int) {

    // Argumentos

    var resultado = numero1 * numero2

    println("Resultado: $resultado")

}

fun saludos(nombre: String, apellido: String = "Sin Apellido") {

    // Argumentos por default y por nombre

    println("Hola $nombre $apellido")

}

fun suma(a: Int, b: Int): Int {

    // Return en funciones

    var resultado = a + b

    return resultado

}

var multiplicacionAnonima = fun(a: Int, b: Int): Int {

    // Funciones literales

    return a * b

}

var multiplicacionLambda = {a: Int, b: Int -> a * b}