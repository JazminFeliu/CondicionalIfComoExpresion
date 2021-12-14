fun main(args: Array<String>) {
    // cargar dos valores enteros, almacenar el mayor en otra variable y mostrarlo

    print("Ingrese el pimer valor entero: ")
    val entero1 = readLine()!!.toInt()

    print("Ingrese el segundo valor entero: ")
    val entero2 = readLine()!!.toInt()

    val mayor = if(entero1 > entero2) entero1 else entero2
    println("El mayor valor entre $entero1 y $entero2 es $mayor")

    //ingresar por teclado un valor entero, guardar el cuadrado si es par y el cubo si es impar y mostrar x pantalla

    print("Ingrese un nro entero: ")
    val entero3 = readLine()!!.toInt()

    val resultado = if(entero3 % 2 == 0) {
        print("El nro $entero3 es par, se calcula su cuadrado: ")
        entero3  * entero3
    }else {
        print("El nro $entero3 es impar, se calcula su cubo: ")
        entero3*entero3*entero3
    }
    println(resultado)

    //Cargar un valor entero por teclado comprendido entre 1 y 99.
    //Almacenar en otra variable la cantidad de dígitos que tiene el valor ingresado por teclado.
    //Mostrar la cantidad de dígitos del número ingresado por teclado.

    val digito = if(entero3 > 9)2 else 1
    println("La cantidad de digitos del nro $entero3 es: $digito")

}