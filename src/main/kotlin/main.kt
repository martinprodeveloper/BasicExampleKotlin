fun main() {

    /* 1

    // Declaración de variables
    // var nombreVariable: Type = value (Valor que cambia)
    // val nombreVariable: Type = value (Valor que no cambia)

    var saludos: String = "Hola Mundo!"
    val PI: Double = 3.14

    println(saludos)
    println(PI)

    // Reasignando valor

    saludos = "Adios Mundo!"

    println(saludos)

    */

    /* 2

    // Inferencia de datos

    var saludos = "Hola Mundo!"

    println(saludos)

    // Reasignando valor

    saludos = "Adios Mundo!"

    println(saludos)

    */

    /* 3

    // Variables de tipo texto

    var nombre = "Peter"
    var apellido = "Parker"

    println(nombre + " " + apellido)
    println("$nombre, $apellido")

    */

    /* 4

    // Variables de tipo número

    var numero1 = 7
    var numero2 = 5

    println("Suma: ${numero1 + numero2}")
    println("Resta: ${numero1 - numero2}")
    println("Multiplicación: ${numero1 * numero2}")
    println("División: ${numero1 / numero2}")
    println("Residuo: ${numero1 % numero2}")

    */

    /* 5

    // Nullables en Kotlin

    var nombre: String?
    nombre = null

    var longitud: Int? = nombre?.length
    println(longitud)

    */

    /* 6

    // Elvis Operator ?:

    var nombre: String?
    nombre = null ?: "Usuario"

    var longitud: Int? = nombre?.length ?: 0
    println("Hola $nombre tu nombre tiene $longitud letras")

    */

    //console()

    exercise1()

}

fun console() {

    // Ingreso de datos en consola

    println("¿Cual es tu color favorito?")

    val color = readLine()

    println("Tu color es: $color")

}

fun exercise1() {

    // Preguntar al usuario algunos datos para crear su cuenta: Usuario, Contraseña, Correo.
    // Luego mostrar información en pantalla

    println("¿Cual es tu usuario?")
    val usuario = readLine()

    println("¿Cual es tu contraseña?")
    val contraseña = readLine()

    println("¿Cual es tu correo?")
    val correo = readLine()

    println("Tu usuario es: $usuario")
    println("Tu contraseña es: $contraseña")
    println("Tu correo es: $correo")
    
}