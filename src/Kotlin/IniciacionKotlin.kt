package Kotlin

fun main() {
    println("hola mundo")
    println("soy juan jose")
    println("2 dam")

    //todo primer comentario
    println(3 + 3)


    val nombre: String = "Juan"
    val edad = 12

    println(nombre)
    println(edad)

    val numPlayer = 5 // INT
    val numDoublePlayer = 5.0 // DOUBLE
    val namePlayer = "J" // CHAR
    val isplay = true // BOOLEAN
    val textPlayer = "hello my name john" // STRING

    val num : Int = 5
    val num1 : Double = 5.6
    val num2 : Long = 5

    //CUENTAS:
    // TODO ESTO SE PUEDE HACER CON TODO TIPO DE OPERADORES
    var a = 1+1
    var b = a+1
    var c = b+a
    println(c)

    val myname : String = "Juan"
    println(myname[0]) // LO QUE SUCEDE ES QUE SEGUN LA POSICION QUE LE DES TE DA SE ACCESO A ESE VALOR
    println(myname[1])
    println(myname[2])
    println(myname[3])

    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Salida verdadero
    println(isFishTasty)   // Salida Falso

    // ESTRUCTURA IF
    if (isKotlinFun){
        println("ACIERTO")
    }else{
        println("ERROR")
    }

    // WHEN
    val day : Int = 2

    val resultado = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> {"Invalid day."}
    }
    println(resultado)

    // WHILE
    // TODO CONSEJO: Buena forma hacer una estructura de repeticion
    var e : Int = 0
    while (e <= 10){
        println("Sube uno el contador "+ e++)
        if (e == 5){ // esto comprobara que si el cont es igual a 5 ejecute lo que desemos dentro del if
            break;
        }
    }

    //ARRAY
    val coche = arrayOf("ferrari", "mercerdes", "BMV", "TESLA")
    println(coche[1])

    //Para cambiar un elemento del array
    coche[2] = "Opel"
    println(coche[2])

    // Saber cuantos elementos hay
    println(coche.size)

    // BUCLE FOR
    for (i in coche.indices){
        println(coche[i])
    }

    fun creacionArray(){
        val arrayNum = arrayOf(1,2,3,4,4,5,56,6)
        for (i in arrayNum.indices){
            println(arrayNum[i])
        }
    }
    creacionArray()

    println("\n")
    // TODO ESTO DETERMINA UN RANGO DESDE UN VALOR A OTRO
    for (arrayNum in 5..15) {
        println(arrayNum)
    }

    //TODO IMPORTANTE PARA HEREDAR SE HACE CON OPEN Al PRINCIPIO
}