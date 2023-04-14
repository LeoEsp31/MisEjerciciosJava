package com.mycompany.ep_guia_7.newpackage.newpackage.newpackage;

import com.mycompany.ep_guia_7.libros.Canción;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canción c1 = new Canción();
        Canción c2 = new Canción("Beeswax", "Nirvana");

        c2.setAutor("Kurdt Cobain");

        c1.setAutor("Nirvana");
        c1.setTítulo("Scentless Apprentice");

        System.out.println("El título de la primera canción es: "
                + c1.getTítulo() + " y el autor: " + c1.getAutor());
        System.out.println("El título de la segunda canción es: "
                + c2.getTítulo() + " y el autor: " + c2.getAutor());
    }

}
