/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 *
 * @author espin
 */
public class Guia5_EPE_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Cúantas filas tendrá la matriz:");
        int N = leer.nextInt();
        System.out.println("Cúantas columnas tendrá la matriz:");
        int M = leer.nextInt();

        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                suma += matriz[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

}
