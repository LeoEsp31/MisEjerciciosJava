/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ep_guia_7.newpackage.newpackage;

import com.mycompany.ep_guia_7.libros.Rectángulo;

/**
 *
 * @author espin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectángulo r1 = new Rectángulo();

        System.out.println("Bienvenido al Creador de Rectángulos!");
        r1.crearRectangulo();

        double perimetro = r1.calcularPerimetro();
        double superficie = r1.calcularSuperficie();
        System.out.println("-----------------------------------------------");
        System.out.println();
        
        r1.dibujar();
        
        System.out.println("El perímetro del rectángulo es: " + perimetro
                + " cm");
        System.out.println("La superficie del rectángulo es: " + superficie
                + " cm2");
        
        
        
    }

}
