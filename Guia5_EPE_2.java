/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 *
 * @author espin
 */
public class Guia5_EPE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores: ");
        int N = leer.nextInt();
        int[] vector1 = new int[N], vector2 = new int[N];

        System.out.println("Primer vector:");
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor del " + (i + 1) + ") elemento:");
            vector1[i] = leer.nextInt();

        }
        System.out.println("Segundo vector:");
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor del " + (i + 1) + ") elemento:");
            vector2[i] = leer.nextInt();
        }
        boolean sonIguales = true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                sonIguales = false;
                break;
            }
        }
        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }

}
