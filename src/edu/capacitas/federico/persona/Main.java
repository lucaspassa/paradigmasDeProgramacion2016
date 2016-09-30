package edu.capacitas.federico.persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Fede on 26/09/2016.
 */
public class Main {

    public static void main(String[] args ) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento;
        try {
            fechaNacimiento = dateFormat.parse("17/08/1995");
        } catch (ParseException e) {
            fechaNacimiento = null;
        }
        Persona persona = new Persona();
        persona.setNombre("Federico");
        persona.setApellido("Bordini");
        persona.setDni("38940065");
        persona.setTelefono("21354339");
        persona.setEdad(21);
        persona.setFechaNacimiento(fechaNacimiento);

        System.out.println("valor de variables");

        System.out.println(persona.getNombre());

        System.out.println(persona.getApellido());
        System.out.println(persona.getDni());
        System.out.println(persona.getTelefono());
        System.out.println(persona.getEdad());
        Date fecha = persona.getFechaNacimiento();
        System.out.println(dateFormat.format(fecha));


    }
}
