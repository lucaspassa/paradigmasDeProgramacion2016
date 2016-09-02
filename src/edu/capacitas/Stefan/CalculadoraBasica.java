/**
 * Created by Stefan on 29/08/2016.
 */
import java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String args[]) {

        Scanner operador = new Scanner(System.in);
        System.out.println("Calculadora básica:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir:");
        System.out.println("Ingrese operación");
        int operacion = operador.nextInt();
        if (!(operacion >= 1 && operacion <= 4)) {
            System.out.println("Operación inválida");
        } else {
            int resultado=0;
            System.out.println("Ingrese operando 1");
            int operando1 = operador.nextInt();
            System.out.println("Ingrese operando 2");
            int operando2 = operador.nextInt();
            if (operacion == 1) {
                resultado = operando1 + operando2;
            } else if (operacion == 2){
            resultado = operando1 - operando2;
            }else if( operacion == 3) {
                resultado = operando1 * operando2;
            }else if( operacion == 4) {
                resultado = operando1 / operando2;
            }
            System.out.println("Resultado: " + resultado);
        }
    }
}
