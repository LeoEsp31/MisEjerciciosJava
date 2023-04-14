package com.mycompany.ep_guia_7.libros;

import java.util.Scanner;

/**
 *     El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author espin
 */

/**
 * Crea una clase "Juego"
 * @author espin
 */
public class Juego {
    /**
     * que tenga un método "iniciar_juego" que permita a dos jugadores jugar un 
     * juego de adivinanza de números.
     */
    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos al juego de adivinanza de números!");
        
        //El primer jugador elige un número y el segundo jugador intenta 
        //adivinarlo.
        System.out.println("El primero jugador elige un número:");
        int jugador1 = leer.nextInt();
        
        /**
         * El segundo jugador tiene un número limitado de intentos y recibe una 
         * pista de "más alto" o "más bajo" después de cada intento.
         */
        int INTENTOS = 5;
        for (int i = 1; i <= INTENTOS; i++) {
            System.out.println("(");
        }
        int jugador2 = leer.nextInt();

    }
}
