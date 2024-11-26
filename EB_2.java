/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author espin
 */
public class EB_2 {

    /**
     * Suma los pares y los impares hasta un número pedido por teclado
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = leer.nextInt();
        int pares, impares;
        pares = 0;
        impares = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }

        System.out.println("La suma de los pares hasta " + num + " es: " + pares);
        System.out.println("La suma de los impares hasta " + num + " es: " + impares);
    }

}
