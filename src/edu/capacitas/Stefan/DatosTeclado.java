/**
 * Created by Stefan on 29/08/2016.
 */
import java.util.Scanner;

public class DatosTeclado {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        String nombre = lector.nextLine();
        lector.close();
        System.out.println("Mi nombre es " + nombre);
    }

}
