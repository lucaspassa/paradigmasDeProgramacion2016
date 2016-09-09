package edu.capacitas.Stefan;

import java.util.Scanner;

/**
 * Created by Stefan on 02/09/2016.
 */

public class Calculadora2 {

    public static void main(String args[]) {
        Scanner operador = new Scanner(System.in);
        float operando=0;
        float resultado = 0;
        int ejecutar=1;
        String operacion;
        int operacionint=0;
        String otracuenta;

        do {
            operacionint=0;
            operacion="";

            mostrarMenu();
            operacion = operador.next();


            if ( !isNumeric(operacion)) {
                System.out.println("Operación inválida");
            }
            else {
                operacionint = Integer.parseInt(operacion);
                if (!(operacionint >= 1 && operacionint <= 4) ) {
                    System.out.println("Operación inválida");
                } else {

                    int i = 0;

                    System.out.println("Ctd. de números?");
                    int ctdnumeros = operador.nextInt();
                    for (i = 1; i <= ctdnumeros; i++) {
                        System.out.println("Ingrese número " + i);
                        operando = operador.nextFloat();
                        switch (operacionint) {
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
                                    resultado = operando;
                                }
                                else{
                                    resultado = resultado / operando;
                                break;
                                }
                        }

                    }
                    System.out.println("Resultado: " + resultado);
                    resultado = 0;


                    System.out.println("Quiere hacer otra cuenta? (s/n)");
                    otracuenta = operador.next();
                    if (otracuenta.equals("n")) {
                        ejecutar = 0;
                    }

                }

            }
        }while( ejecutar == 1 );
    }

    public static void mostrarMenu() {
        System.out.println("Calculadora2:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir:");
        System.out.println("Ingrese operación");
        return;
    }

    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
