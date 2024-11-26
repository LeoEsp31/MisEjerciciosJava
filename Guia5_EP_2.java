/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 * @author espin
 */
public class Guia5_EP_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int N = leer.nextInt();
        int contador = 0;
        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("Ingrese el número que desea buscar:");
        int num = leer.nextInt();

        for (int i = 0; i < N; i++) {
            if (vector[i] == num) {
                contador++;
                System.out.println("El número se encuentra en el indice: " + i);
            }

            if (contador > 1) {
                System.out.println("El número se encuentra repetido " + contador + " veces.");
            }
        }

    }

}
