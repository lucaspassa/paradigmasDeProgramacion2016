package edu.capacitas.Stefan;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Stefan on 31/10/2016.
 */
public class fecha {
    public static void main(String[] args) {
        System.out.println("Fechas");
        System.out.println(Calendar.getInstance().getTime());
        System.out.println(Calendar.getInstance().getTimeZone());
        Calendar calendario=Calendar.getInstance();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(calendario.getTime()));
    }
}
