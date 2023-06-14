fun main() {

    // list()
    // setList()
    mapList()

}

fun list() {

    // Creando una lista
    // listOf/mutableListOf(value1, value2, value3, etc..)
    // var/val listName = listOf(value1, value2, value3)

    var paises = mutableListOf("Perú", "Brasil", "Argentina")

    println(paises)
    println(paises[0])

    paises[1] = "Colombia"
    println(paises[1])

}

fun setList() {

    // Creando un set
    // setOf/mutableSetOf(value1, value2, value3, etc..)
    // no se puede editar un elemento
    // var/val setName = setOf(value1, value2, value3)

    var paises = mutableSetOf("Perú", "Brasil", "Argentina", "Perú")

    println(paises)
    println(paises.elementAt(0))

    paises.remove("Brasil")
    println(paises)

}

fun mapList() {

    // Creando un map
    // mapOf/mutableMapOf(key1 to val1, key 2 to val2, etc..)
    // no se puede modificar el key
    // var/val mapName = mapOf(key1 to val1, key2 to val2)

    var datosUsuario = mutableMapOf("name" to "Martin", "password" to "123")

    println(datosUsuario)
    println(datosUsuario["name"])
    println(datosUsuario.keys)
    println(datosUsuario.values)

    datosUsuario["name"] = "Pedro"
    println(datosUsuario["name"])

}