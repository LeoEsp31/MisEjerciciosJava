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
public class EjerciciosBasicos_1 {

    /**1. Calcula el factorial de un número pedido por teclado
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int n = leer.nextInt();
        int resultado = 1;
        for (int i = 1; i<=n;i++) {
            resultado *= i;
        }
        System.out.println("El factorial de " + n + " es : " + resultado);
    }
    
}
