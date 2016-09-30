package edu.capacitas.Stefan.Testpackage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Stefan on 30/09/2016.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Test persona1 = new Test();
        Test persona2 = new Test();
        Test persona3 = new Test();

        System.out.println("Valores de las variables");

        System.out.println("\n\rPersona 1");
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento1= formatoFecha1.parse("19/05/1978");
        persona1.setNombre("Stefan");
        persona1.setApellido("Ronacher");
        persona1.setDni("92844240");
        persona1.setTelefono("154301742");
        persona1.setEdad(38);
        persona1.setFechaNacimiento(fechaNacimiento1);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        System.out.println(persona1.getDni());
        System.out.println(persona1.getTelefono());
        System.out.println(persona1.getEdad());
        Date fecha=persona1.getFechaNacimiento();
        System.out.println(formatoFecha1.format(fecha));

        System.out.println("\n\rPersona 2");
        SimpleDateFormat formatoFecha2 = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento2= formatoFecha2.parse("20/03/2013");
        persona2.setNombre("Pablo");
        persona2.setApellido("Rodríguez");
        persona2.setDni("45000000");
        persona2.setTelefono("154122334");
        persona2.setEdad(6);
        persona2.setFechaNacimiento(fechaNacimiento2);
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());
        System.out.println(persona2.getDni());
        System.out.println(persona2.getTelefono());
        System.out.println(persona2.getEdad());
        Date fecha2=persona2.getFechaNacimiento();
        System.out.println(formatoFecha2.format(fecha2));

        System.out.println("\n\rPersona 3");
        SimpleDateFormat formatoFecha3 = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento3= formatoFecha3.parse("20/03/1950");
        persona3.setNombre("Ariel");
        persona3.setApellido("Ramírez");
        persona3.setDni("29000123");
        persona3.setTelefono("154099112");
        persona3.setEdad(50);
        persona3.setFechaNacimiento(fechaNacimiento3);
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());
        System.out.println(persona3.getDni());
        System.out.println(persona3.getTelefono());
        System.out.println(persona3.getEdad());
        Date fecha3=persona3.getFechaNacimiento();
        System.out.println(formatoFecha3.format(fecha3));
    }

}
