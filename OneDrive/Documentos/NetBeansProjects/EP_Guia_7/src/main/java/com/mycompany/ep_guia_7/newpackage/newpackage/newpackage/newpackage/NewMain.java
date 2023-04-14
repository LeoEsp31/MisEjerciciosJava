package com.mycompany.ep_guia_7.newpackage.newpackage.newpackage.newpackage;

import com.mycompany.ep_guia_7.libros.Punto;

public class NewMain {

    public static void main(String[] args) {
        Punto p1 = new Punto();
        p1.crearPunto();
        double distancia = p1.calcular();
        System.out.println("La distancia entre los puntos es: " + distancia);
    }

}
