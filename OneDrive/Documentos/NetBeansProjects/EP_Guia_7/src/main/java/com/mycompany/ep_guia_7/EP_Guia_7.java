package com.mycompany.ep_guia_7;

import com.mycompany.ep_guia_7.libros.Libro;

public class EP_Guia_7 {

    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro(89562441, "Las piedras", "leo esp", 65656);
        l1.cargarLibro();
        l2.mostrarLibro();

    }
}
