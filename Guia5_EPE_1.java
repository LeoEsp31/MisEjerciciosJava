/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 *
 *
 * @author espin
 */
public class Guia5_EPE_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Cúantos elementos tendrá el vector?");
        int N = leer.nextInt();

        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor del " + (i + 1) + ") elemento:");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos es: " + suma);

    }

}
