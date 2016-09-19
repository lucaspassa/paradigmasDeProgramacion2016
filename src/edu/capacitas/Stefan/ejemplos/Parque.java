package edu.capacitas.Stefan.ejemplos;

/**
 * Created by Stefan on 19/09/2016.
 */
public class Parque {
    public static void main(String args[]){
        Casa casa=new Casa();
        casa.setColor("Rojo");
        String color = casa.getColor();
        System.out.println(color);
        Casa casados=new Casa();
        System.out.println(casados.getColor());
    }
}
