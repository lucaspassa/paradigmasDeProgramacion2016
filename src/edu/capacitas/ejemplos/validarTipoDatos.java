package edu.capacitas.ejemplos;

import java.util.Scanner;

/**
 * Created by lucas on 05/09/16.
 */
public class validarTipoDatos {

    public static void main(String args[]){
        System.out.println("Ingrese un número");
        Scanner lector = new Scanner(System.in);
        String numero = lector.nextLine();

        if (isNumeric(numero)) {
            System.out.println("Es un número");
        } else {
            System.out.println("NO es un número");
        }
        lector.close();
    }

    // Función para validar un número
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
