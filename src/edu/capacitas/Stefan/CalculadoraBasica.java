package edu.capacitas.Stefan; /**
 * Created by Stefan on 29/08/2016.
 */
import java.util.Scanner;
public class CalculadoraBasica {

    public static void main(String args[]) {
        Scanner operador = new Scanner(System.in);

        String operacion;
        String otracuenta;
        int repetir=1;
        int operacionint=0;
        int validoperacion=1;

        do{

        do {
            mostrarMenu();
            System.out.println("Ingrese operacion:");
            operacion = operador.nextLine();
            if (!isNumeric(operacion) ) {
                System.out.println("Operación inválida");
                validoperacion = 0;
            }else {
                operacionint = Integer.parseInt(operacion);
                if (!isNumeric(operacion) || !(operacionint >= 1 && operacionint <= 4)) {
                    System.out.println("Operación inválida");
                    validoperacion = 0;
                } else {
                    validoperacion = 1;
                }
            }
        }while(validoperacion==0 );

            float resultado=0;
            int validop1=1;
            int validop2=1;
            String operando1s;
            String operando2s;
            float operando1;
            float operando2;

            do {
                System.out.println("Ingrese operando 1");
                operando1s = operador.nextLine();

                if (!isNumeric(operando1s)) {
                    System.out.println("Operando debe ser número");
                    validop1 = 0;
                }
                else {
                    validop1 = 1;
                }

            }   while(validop1==0 );
                    do {
                        System.out.println("Ingrese operando 2");
                        operando2s = operador.nextLine();
                        if (!isNumeric(operando2s)) {
                            System.out.println("Operando debe ser número");
                            validop2 = 0;
                        }
                        else {
                            validop2 = 1;
                        }
                    } while (validop2 == 0);

            operando1= Float.parseFloat(operando1s);
            operando2= Float.parseFloat(operando2s);
            if (operacionint == 1) {
                resultado = operando1 + operando2;
                System.out.println("Resultado: " + resultado);
            } else if (operacionint == 2){
                resultado = operando1 - operando2;
                System.out.println("Resultado: " + resultado);
            }else if( operacionint == 3) {
                resultado = operando1 * operando2;
                System.out.println("Resultado: " + resultado);
            }else if( operacionint == 4) {
                if( operando2==0 ) {
                    System.out.println("No se puede calcular división por cero");
                }
                else {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado: " + resultado);
                }
            }
            System.out.println("Desea hacer otra cuenta? (s/n)");
            otracuenta = operador.nextLine();
            if( otracuenta.equals("n")){
                repetir = 0;
            }
        }while (repetir==1);
}

    public static void mostrarMenu() {
        System.out.println("Calculadora básica:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir:");
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






    // Función para validar un número
