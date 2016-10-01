package edu.capacitas.federico.Contacto;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by Fede on 30/09/2016.
 */
public class Contacto {

    private ID Long;
    private String nombre;
    private String telefono;
    private int edad;
    private String email;


    public ID getLong() {return Long;}
    public void setLong(ID Long) { this.Long = Long; }

    public String getnombre() {return nombre;}
    public void setnombre(String nombre) { this.nombre = nombre; }

    public String gettelefono() {return telefono;}
    public void settelefono(String telefono) { this.telefono = telefono; }

    public  int getedad() {return edad;}
    public void setedad(int edad) { this.edad = edad;}

    public String getemail() {return email;}
    public  void setemail(String email) {this.email = email;}


    }



