package edu.capacitas.Stefan;

import java.util.Scanner;

/**
 * Created by Stefan on 02/09/2016.
 */

public class Calculadora2 {

    public static void main(String args[]) {

        float operando=0;
        float resultado = 0;
        int ejecutar=1;
        int operacion=0;
        String otracuenta;
        int ctdnumeros;

        do {
            mostrarMenu();
            operacion = pedirOperacion();
            ctdnumeros = pedirCtdNumeros();
            for (int i = 1; i <= ctdnumeros; i++) {
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

    public static void mostrarMenu() {
        System.out.println("Calculadora2:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        return;
    }

    public static int pedirCtdNumeros() {
        String ctdnumeros;
        Scanner operador = new Scanner(System.in);
        System.out.println("Ctd. de números?");
        ctdnumeros = operador.next();
        while ( !isNumeric(ctdnumeros) || Integer.parseInt(ctdnumeros)<=0 ) {
            System.out.println("Entrada inválida");
            ctdnumeros = operador.next();
        }
        //operador.close();
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
        String operacion;
        Scanner operador = new Scanner(System.in);
        System.out.println("Ingrese operación:");
        operacion = operador.next();
        while ( !isNumeric(operacion) || Integer.parseInt(operacion)<=0 || Integer.parseInt(operacion)>4  ) {
            System.out.println("Operacion inválida");
            operacion = operador.next();
        }
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
}
