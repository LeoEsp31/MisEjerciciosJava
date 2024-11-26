/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 *
 * @author espin
 */
public class Guia5_EPE_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        rellenar(vector);
        mostrar(vector);

    }

    public static void rellenar(int[] vector) {
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static void mostrar(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("]");
        System.out.println();
    }
}
