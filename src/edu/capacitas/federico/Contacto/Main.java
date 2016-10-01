package edu.capacitas.federico.Contacto;

/**
 * Created by Fede on 30/09/2016.
 */
public class Main {

    public static void main(String[] args ){

        Contacto contacto = new Contacto();

        System.out.println("Valores de las variables");

        System.out.println("contacto");
        contacto.setnombre("Federico");
        contacto.settelefono("2944805143");
        contacto.setedad(21);
        contacto.setemail("fedee_13_bordini@hotmail.com");


        System.out.println(contacto.getnombre());
        System.out.println(contacto.gettelefono());
        System.out.println(contacto.getedad());
        System.out.println(contacto.getemail());





    }





}
