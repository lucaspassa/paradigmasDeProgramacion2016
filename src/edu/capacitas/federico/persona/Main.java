package edu.capacitas.federico.persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Fede on 26/09/2016.
 */
public class Main {

    public static void main(String[] args ) throws ParseException {

            Persona persona1 = new Persona();
            Persona persona2 = new Persona();
            Persona persona3 = new Persona();

        System.out.println("Valores de las variables");

        System.out.println("\n\rPersona 1");
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento1= formatoFecha1.parse("17/08/1995");
        persona1.setNombre("Federico");
        persona1.setApellido("Bordini");
        persona1.setDni("38940065");
        persona1.setTelefono("204340320");
        persona1.setEdad(21);
        persona1.setFechaNacimiento(fechaNacimiento1);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        System.out.println(persona1.getDni());
        System.out.println(persona1.getTelefono());
        System.out.println(persona1.getEdad());
        Date fecha=persona1.getFechaNacimiento();
        System.out.println(formatoFecha1.format(fecha));


        System.out.println("\n\rPersona 2");
        System.out.println("Valores de las variables");

        System.out.println("\n\rPersona 2");
        SimpleDateFormat formatoFecha2 = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento2= formatoFecha2.parse("11/03/1965");
        persona2.setNombre("Piero");
        persona2.setApellido("Bordini");
        persona2.setDni("18333");
        persona2.setTelefono("32302949");
        persona2.setEdad(75);
        persona2.setFechaNacimiento(fechaNacimiento1);
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());
        System.out.println(persona2.getDni());
        System.out.println(persona2.getTelefono());
        System.out.println(persona2.getEdad());
        Date fecha2=persona2.getFechaNacimiento();
        System.out.println(formatoFecha2.format(fecha));

        System.out.println("\n\rPersona 3");
        System.out.println("Valores de las variables");

        System.out.println("\n\rPersona 3");
        SimpleDateFormat formatoFecha3 = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento3= formatoFecha3.parse("21/04/1996");
        persona3.setNombre("Lucia");
        persona3.setApellido("Valderrama");
        persona3.setDni("39444583");
        persona3.setTelefono("2204014235");
        persona3.setEdad(20);
        persona3.setFechaNacimiento(fechaNacimiento1);
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());
        System.out.println(persona3.getDni());
        System.out.println(persona3.getTelefono());
        System.out.println(persona3.getEdad());
        Date fecha3=persona3.getFechaNacimiento();
        System.out.println(formatoFecha3.format(fecha));


    }
}
