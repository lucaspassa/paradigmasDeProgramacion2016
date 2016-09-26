package edu.capacitas.Stefan.persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Stefan on 24/09/2016.
 */

public class Main {

    public static void main(String[] args) throws ParseException {
        Persona persona = new Persona();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento= formatoFecha.parse("19/05/1978");
        System.out.println("Valores de las variables");
        persona.setNombre("Stefan");
        persona.setApellido("Ronacher");
        persona.setDni("92844240");
        persona.setTelefono("154301742");
        persona.setEdad(38);
        persona.setFechaNacimiento(fechaNacimiento);
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getDni());
        System.out.println(persona.getTelefono());
        System.out.println(persona.getEdad());

        Date fecha=persona.getFechaNacimiento();
        System.out.println(formatoFecha.format(fecha));


    }
}