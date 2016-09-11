package edu.capacitas.Stefan;

import java.util.Scanner;

/**
 * Created by Stefan on 02/09/2016.
 */

public class Calculadora2 {

    public static void main(String args[]) {

        float operando=0;
        float resultado = 0;
        int ctdnumeros=0;
        int operacion=0;


        do {
            mostrarMenu();
            operacion = pedirOperacion();
            ctdnumeros =  pedirCtdNumeros();
            for (int i = 1; i <= 2; i++) {
                operando = pedirNumero(i);
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
                            resultado = operando;
                        }
                        else{
                            resultado = resultado / operando;
                            break;
                        }
                }
            }
            System.out.println("Resultado: " + resultado);

    } while( OtraCuenta());
}


    public static int pedirCtdNumeros() {
        boolean ok;
        String ctdnumeros="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Cantidad de números:");
        do {
            ctdnumeros = sc.next();
            if(!isNumeric(ctdnumeros) ){
                ok=false;
                System.out.println("Cantidad de nros debe ser numérico.");}
            else if (Integer.parseInt(ctdnumeros) < 1) {
                ok=false;
                System.out.println("Cantidad de nros debe ser positivo.");
            }
            else {
                ok = true;
            }
        } while (!ok);

        sc.close();
        return Integer.parseInt(ctdnumeros);
    }


    public static float pedirNumero(int i) {
        String numero;
        Scanner operador = new Scanner(System.in);
        System.out.println("Ingrese número " + i);
        numero = operador.next();
        while ( !isNumeric(numero)) {
            System.out.println("Entrada inválida");
            numero = operador.next();
        }
        operador.close();
        return Float.parseFloat(numero);
    }


    public static int pedirOperacion() {
        boolean ok;
        String operacion;
        Scanner operador = new Scanner(System.in);
        System.out.println("Ingrese operación:");

        do {
            operacion = operador.next();
            if(!isNumeric(operacion) ){
                ok=false;
                System.out.println("Operacion de 1 a 4");}
            else if (Integer.parseInt(operacion)<1 || Integer.parseInt(operacion)>4) {
                ok=false;
                System.out.println("Operacion de 1 a 4");
            }
            else {
                ok = true;
            }
        } while (!ok);
        operador.close();
        return Integer.parseInt(operacion);
    }

    //TODO lalalal
    public static boolean OtraCuenta() {
        String otracuenta;
        Scanner operador = new Scanner(System.in);
        System.out.println("Quiere hacer otra cuenta? (s/n)");

        otracuenta = operador.next();
        //FIXME hacer tal cosa para que ande mejor
        while ( !(otracuenta.equals("n") || !otracuenta.equals("s")) ) {
            System.out.println("Entrada inválida");
            otracuenta = operador.next();
        }
        operador.close();
        if (otracuenta.equals("n")) {
            return false;
        }else {
            return true;
        }
    }

    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    public static void mostrarMenu() {
        System.out.println("Calculadora2:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        return;
    }
}
