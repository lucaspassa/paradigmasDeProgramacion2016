package edu.capacitas.Stefan.examen;
/**
 * Created by Stefan on 30/09/2016.
 */
public class Main {
    public static void main(String[] args){
        Contacto contacto = new Contacto();

        System.out.println("Datos del contacto:");
        contacto.setId(53);
        contacto.setNombre("Stefan");
        contacto.setTelefono("154301742");
        contacto.setEdad(38);
        contacto.setEmail("gauchoaleman@yahoo.com");
        System.out.println("Id: "+contacto.getId());
        System.out.println("Nombre: "+contacto.getNombre());
        System.out.println("Telefono: "+contacto.getTelefono());
        System.out.println("Edad: "+contacto.getEdad());
        System.out.println("Email: "+contacto.getEmail());
    }
}
