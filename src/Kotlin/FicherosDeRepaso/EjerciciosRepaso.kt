package Kotlin.FicherosDeRepaso

fun main() {
    //  sumaNumeros()
    // imparPar()
    // maxNum()
    // conversorTemp()
    // calculadora()
    // invertCadena()
    // factorial()


}

//TODO NIVEL PRINCIPIANTE

fun sumaNumeros() {
    println("Introduce dos numeros: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    val resultado = num1.plus(num2)
    println("Resultado: $resultado")
}

fun imparPar() {
    println("Introduce un numero")
    val num = readln().toInt()
    if (num % 2 == 0) {
        println("es par")
    } else {
        println("es impar")
    }
}

fun maxNum() {
    println("Introduce tres numeros")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    if (num1 > num2 && num1 > num3) {
        println("El ${num1} es el mayor")
    } else if (num2 > num3 && num2 > num1) {
        println("El ${num2} es el mayor")
    } else {
        println("El ${num3} es el mayor")
    }
}

fun conversorTemp() {
    println("Introduce un numero")
    val num1 = readln().toInt()
    val resultado = (num1 - 32) * 5 / 9
    println("Resultado en grados Celcius: $resultado")
}

fun calculadora() {
    mostrarMenu()
    println("Selecciona una opcion: ")
    val opcion = readln().toInt()
    println("Introduce dos numeros: ")
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    when (opcion) {
        1 -> println("Esta es la suma " + num2.plus(num3))
        2 -> println("Esta es la resta " + num2.minus(num3))
        3 -> println("Esta es la multiplicación " + num2 * num3)
        4 -> println("Esta es la dividir " + num2 / num3)
    }

}

fun mostrarMenu() {
    println("====== Calculadora ======")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")
}

//TODO NIVEL MEDIO

fun invertCadena() {
    println("Introduce una palabra: ")
    val palabra = readln()
    println(palabra.reversed())
}

fun factorial() {
    var factorial = 1
    println("Introduce un numero: ")
    var num1 = readln().toInt()
    for (i in 1..num1) {
        factorial *= i
    }
    println("El factorial de " + num1 + " es: ${factorial}")
}















