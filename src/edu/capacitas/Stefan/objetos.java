package edu.capacitas.ejemplos.objetos;

/**
 * Created by Stefan on 12/09/2016.
 */
class testObjetos {

    public static void main(String args[]) {
        Perro perroLucas = new Perro();
        Perro perroStefan = new Perro();

        perroLucas.setRaza("Doberman");
        perroLucas.setCantidadPatas(Integer.valueOf(2));
        perroStefan.setRaza("Caniche");

        System.out.println(perroLucas.getRaza());
        System.out.println(perroLucas.getCantidadPatas());
        System.out.println(perroStefan.getRaza());

    }
}

