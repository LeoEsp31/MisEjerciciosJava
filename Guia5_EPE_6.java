/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 *
 * @author espin
 */
public class Guia5_EPE_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        String palabra, letra;
        int numAleatorio;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra de 3 caracteres como "
                        + "mínimo y 5 como máximo:");
                palabra = leer.next();
                if (palabra.length() > 5 || palabra.length() < 3) {
                    System.out.println("Ingresó una palabra de longitud incorrecta.");
                }
            } while (palabra.length() < 3 || palabra.length() > 5);

            numAleatorio = (int) (Math.random() * 19);

            for (int j = 0; j < palabra.length(); j++) {
                letra = palabra.substring(j, (j + 1));
                matriz[numAleatorio][j] = letra;
            }

        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = Integer.toString((int) (Math.random() * 10));
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

    }

}
