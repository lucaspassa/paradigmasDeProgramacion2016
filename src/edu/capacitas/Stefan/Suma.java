import java.util.Scanner;

public class Suma {
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        String nombre = lector.nextLine();
        lector.close();
        int suma = a+b;
        System.out.println("La suma es " + suma);

    }

}
