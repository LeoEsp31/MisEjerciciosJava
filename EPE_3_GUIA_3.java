/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *  Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
    trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
    la función equals() de la clase String.

 * @author espin
 */
public class EPE_3_GUIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
        letra = letra.toUpperCase();
        if ("A".equals(letra)||"E".equals(letra)||"I".equals
        (letra)||"O".equals(letra)||"U".equals(letra)){
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada NO es una vocal.");
        }
    }
    
}
