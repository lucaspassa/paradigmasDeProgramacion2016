package edu.capacitas.Stefan;

import java.util.Scanner;

/**
 * Created by Stefan on 02/09/2016.
 */


import java.util.Scanner;

public class Calculadora2 {

    public static void main(String args[]) {
        Scanner operador = new Scanner(System.in);
        float operando=0;
        float resultado = 0;
        int ejecutar=1;
        while( ejecutar == 1 ) {
            mostrarMenu();
            int operacion = operador.nextInt();
            if (!(operacion >= 1 && operacion <= 4)) {
                System.out.println("Operación inválida");
            } else {

                int i = 0;

                System.out.println("Ctd. de números?");
                int ctdnumeros = operador.nextInt();
                for (i = 1; i <= ctdnumeros; i++) {
                    System.out.println("Ingrese número " + i);
                    operando = operador.nextFloat();
                    switch (operacion) {
                        case 1:

                            resultado += operando;
                            break;
                        case 2:
                            resultado -= operando;
                            break;
                        case 3:
                            if (i == 1 && resultado == 0) {
                                resultado = 1;
                            }
                            resultado = resultado * operando;
                            break;
                        case 4:
                            if (i == 1 && resultado == 0) {
                                resultado = 1;
                            }
                            resultado = resultado / operando;
                            break;
                    }

                }
                System.out.println("Resultado: " + resultado);
                resultado = 0;
            }
            System.out.println("Quiere hacer otra cuenta? (1/0)");
            int otra = operador.nextInt();
            if (otra == 0) {
                ejecutar = 0;
            }

        }
    }

    public static void mostrarMenu() {
        System.out.println("Calculadora2:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir:");
        System.out.println("Ingrese operación");
    }
}
