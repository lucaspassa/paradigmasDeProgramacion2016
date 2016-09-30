package edu.capacitas.Stefan.Testpackage;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Stefan on 30/09/2016.
 */
    /**
     * Created by Stefan on 24/09/2016.
     */
    public class Test {
        private String nombre;
        private String apellido;
        private String dni;
        private String telefono;
        private int edad;
        private Date fechaNacimiento;

        public Test() throws ParseException {
        }

        public String getNombre() {return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return this.apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDni() {
            return this.dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public String getTelefono() {
            return this.telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Date getFechaNacimiento() {
            return this.fechaNacimiento;
        }

        public void setFechaNacimiento(Date fechaNacimiento) {

            this.fechaNacimiento = fechaNacimiento;
        }
    }
