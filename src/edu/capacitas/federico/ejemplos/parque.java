package edu.capacitas.federico.ejemplos;

/**
 * Created by Fede on 19/09/2016.
 */
public class parque {
    public static void main(String arge[]){
        Casa casa=new Casa();
        casa.setColor("rojo");
        String color = casa.getColor();
        System.out.print(color);
        Casa casaDos = new Casa();
        System.out.println(casaDos.getColor());
    }
}
