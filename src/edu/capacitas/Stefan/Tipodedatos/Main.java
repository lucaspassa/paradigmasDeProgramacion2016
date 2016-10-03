package edu.capacitas.Stefan.Tipodedatos;

/**
 * Created by Stefan on 03/10/2016.
 */
public class Main {
        public static void main(String[] args){

            DatosPrimarios primarios = new DatosPrimarios();
            DatosObjetos objetos = new DatosObjetos();

            System.out.println("Datos primarios:");

            primarios.setDatobyte((byte)125);
            primarios.setDatoshort((short)259);
            primarios.setDatoint(100000200);
            primarios.setDatolong(192837939);
            primarios.setDatofloat((float)100092.25);
            primarios.setDatodouble(933838928.23);
            primarios.setDatochar('a');
            primarios.setDatoboolean(true);
            System.out.println("byte: "+ primarios.getDatobyte());
            System.out.println("short: "+primarios.getDatoshort());
            System.out.println("int: "+primarios.getDatoint());
            System.out.println("long: "+primarios.getDatolong());
            System.out.println("float: "+primarios.getDatofloat());
            System.out.println("double: "+primarios.getDatodouble());
            System.out.println("char: "+primarios.getDatochar());
            System.out.println("boolean: "+primarios.isDatoboolean());

            System.out.println("\n\rDatos objetos:");

            objetos.setDatoByte((byte)125);
            objetos.setDatoShort((short)259);
            objetos.setDatoInt(100000200);
            objetos.setDatoLong(192837939);
            objetos.setDatoFloat((float)100092.25);
            objetos.setDatoDouble(933838928.23);
            objetos.setDatoChar('a');
            objetos.setDatoString("hola mundo");
            objetos.setDatoBoolean(true);
            System.out.println("Byte: "+ objetos.getDatoByte());
            System.out.println("Short: "+objetos.getDatoShort());
            System.out.println("Int: "+objetos.getDatoInt());
            System.out.println("Long: "+objetos.getDatoLong());
            System.out.println("Float: "+objetos.getDatoFloat());
            System.out.println("Double: "+objetos.getDatoDouble());
            System.out.println("Char: "+objetos.getDatoChar());
            System.out.println("String: "+objetos.getDatoString());
            System.out.println("Boolean: "+objetos.isDatoBoolean());
        }
    }
