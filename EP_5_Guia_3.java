/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios: ○ Los socios tipo ‘A’ abonan una
 * cuota mayor, pero tienen un 50% de descuento en todos los tipos de
 * tratamientos. ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
 * de descuento para los mismos tratamientos que los socios del tipo A. ○ Los
 * socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos. ○ Solicite una letra (carácter) que representa la clase de un
 * socio, y luego un valor real que represente el costo del tratamiento (previo
 * al descuento) y determine el importe en efectivo a pagar por dicho socio.
 *
 *
 * @author espin
 */
public class EP_5_Guia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio = "";
        double costoFinal = 0;
        boolean esValida = false;
        while (!esValida) {
            System.out.println("Qué tipo de socio es? (A, B, C):");
            socio = leer.next();
            if ("A".equalsIgnoreCase(socio) || "B".equalsIgnoreCase
                (socio) || "C".equalsIgnoreCase(socio)) {
                esValida = true;
            } else {
                System.out.println("Ingresó un caracter no válido.");
            }
        }
        System.out.println("Ingrese el costo del tratamiento:");
        double costoTotal = leer.nextInt();
        switch (socio.toUpperCase()) {
            case "A" -> costoFinal = costoTotal / 2;
            case "B" -> costoFinal = costoTotal - (costoTotal * 0.35);
            case "C" -> costoFinal = costoTotal;
        }
        System.out.println("El costo final a pagar es $" + costoFinal);
    }
}
