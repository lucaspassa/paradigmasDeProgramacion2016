package edu.capacitas;

// Declaración de inicio de Clase
public class Main {

    // Declaración de método de ejecuión
    public static void main(String[] args) {

        // Línea de impresión por pantalla de una cadena de caracteresSystem.lineSeparator()
        System.out.println("Hola Mundo");

        // Línea que concatena catacter y un valor devuelto por una función
        System.out.println("Hola Error - " + System.lineSeparator());

        // Declarar un Entero
        int entero = 10;

        // Declarar un entero largo
        long enteroLargo = 1000;

        // Sacar por pantalla el valor de
        System.out.println("El valor del entero es :" + entero);

        System.out.println("El valor del entero largo es: " + enteroLargo);

        entero = entero + entero;

        System.out.println("El nuevo valor del entero anterior sumado a su mismo valor es " + entero);


    }
}
