package edu.capacitas.Stefan;

import java.util.Scanner;

/**
 * Created by Stefan on 02/09/2016.
 */

public class Calculadora2 {

    Scanner teclado;


    public Calculadora2() {
            this.teclado = new Scanner(System.in);
    }

    public static void main(String args[]) {

        float operando=0;
        float resultado = 0;
        int ctdnumeros=0;
        int operacion=0;


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
        return 0;
}






    private int pedirCtdNumeros() {
        boolean ok;
        String ctdnumeros="";

        System.out.println("Ingrese Cantidad de números:");
        do {
            ctdnumeros = this.teclado.next();
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

        return Integer.parseInt(ctdnumeros);
    }


    private float pedirNumero(int i) {
        String numero;

        System.out.println("Ingrese número " + i);
        numero = this.teclado.next();
        while ( !isNumeric(numero)) {
            System.out.println("Entrada inválida");
            numero = this.teclado.next();
        }

        return Float.parseFloat(numero);
    }


    private int pedirOperacion() {
        boolean ok;
        String operacion;

        System.out.println("Ingrese operación:");

        do {
            operacion = this.teclado.next();
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
        return Integer.parseInt(operacion);
    }


    private boolean OtraCuenta() {
        String otracuenta;

        System.out.println("Quiere hacer otra cuenta? (s/n)");

        otracuenta = this.teclado.next();

        while ( !(otracuenta.equals("n") || !otracuenta.equals("s")) ) {
            System.out.println("Entrada inválida");
            otracuenta = this.teclado.next();
        }

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

    private static void mostrarMenu() {
        System.out.println("Calculadora2:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        return;
    }
}
