package edu.capacitas.eric.persona.examen;

/**
 * Created by braian on 30/09/16.
 */
public class AppContacto {

    public static void main(String[] args) {
        Contacto contacto = new Contacto();
//        contacto.setId("id213");
        contacto.setNombre("Eric");
        contacto.setTelefono("154251377");
        contacto.setEdad(21);
        contacto.setEmail("n.b.e_13@hotmail.com");

        System.out.println("valor de variables");

//        System.out.println(contacto.getId());
        System.out.println(contacto.getNombre());
        System.out.println(contacto.getTelefono());
        System.out.println(contacto.getEdad());
        System.out.println(contacto.getEmail());
    }
}
