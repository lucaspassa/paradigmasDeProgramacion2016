package edu.capacitas.eric.persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by braian on 26/09/16.
 */
public class AppPersona {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento;
        try {
            fechaNacimiento = dateFormat.parse("22/12/1990");
        } catch (ParseException e) {
            fechaNacimiento = null;
        }
        Persona persona = new Persona();
        persona.setNombre("Eric");
        persona.setApellido("Nogales");
        persona.setDni("39648090");
        persona.setTelefono("154253464");
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