/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

/**Realizar un algoritmo que llene un vector con los 100 primeros números 
 * enteros y los muestre por pantalla en orden descendente.

 *
 * @author espin
 */
public class Guia_5_EP_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] enteros = new int[100];
        
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
        }
        for (int i = enteros.length - 1; i >= 0; i--) {

            System.out.println(enteros[i]);
        }
    }

}
