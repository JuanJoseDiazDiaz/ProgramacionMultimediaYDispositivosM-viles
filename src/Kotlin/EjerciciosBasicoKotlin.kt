@file:Suppress("DUPLICATE_LABEL_IN_WHEN")

package Kotlin

fun main(args: Array<String>) {
    // sendMessage() -> Declaración y Uso de Variables
    // sentencesCondicional() -> If
    // sentencesCondicional2() -> When
    //loop() -> For
    // loopWhile() -> While
    // listStudent() -> Listas
    // listStudent2() -> Listas
}

fun sendMessage() {
    val num = 2
    var num1 = 2
    val name = "Juan"
    var name1 = "Juan"
    var numfloat = 4f
    val numfloat1 = 4f
    val canSend = true
    var canSend1 = false

    println(num)
    println(num1)
    println(numfloat)
    println(numfloat1)
    println(name)
    println(name1)
    println(canSend)
    println(canSend1)

}

fun sentencesCondicional() {
    println("Introduce un numero: ")
    var numUsuario = readln().toInt()
    if (numUsuario % 2 == 0) {
        println("Es par")
    } else {
        println("No es par")
    }
}

fun sentencesCondicional2() {
    // TODO PARA COMPRENDER UN NUMERO HASTA OTRO SE HACE CON IN DELANTE DE LA VARIABLE O LA VARIABLE Y IN
    println("Introduce un numero: ")
    val numUsuario = readln().toInt()

    val resultado = when (numUsuario) {
        in 0..10 -> "tu numero esta desde el 0 al 10"
        in 11..20 -> "tu numero esta desde el 11 al 20"
        in 21..30 -> "tu numero esta desde el 0 al 10"
        else -> {
            "Rango de numero invalido"
        }
    }
    println(resultado)
}

fun loop() {
    for (i in 1..50) {
        if (i % 2 == 1) {
            println(i)
        }
    }
}

fun loopWhile() {
    var cont = 0
    var numUsuario: Int
    do {
        println("Introduce un número: ")
        numUsuario = readln().toInt()
        if (numUsuario >= 0) {
            cont++
        }
    } while (numUsuario >= 0)

    println("Has introducido $cont números positivos.")
}

fun listStudent() {
    var listStudent = arrayOf("juan", "jose", "Marta", "Sergio", "pepe")
    println(listStudent.sorted().toString())
}

fun listStudent2() {
    var listStudent : ArrayList<String> = arrayListOf("juan", "jose", "Marta", "Sergio", "pepe")
    listStudent.add("Adela")
    println(listStudent.sorted().toString())
    listStudent.remove(listStudent[4])
    println(listStudent.toString())
}
