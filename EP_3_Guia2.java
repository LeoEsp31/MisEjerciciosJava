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
public class EP_3_Guia2 {

    /**Escribir un programa que pida una frase y la muestre toda en mayúsculas y
     * después toda en minúsculas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        System.out.println("La frase en mayúsculas es: " + mayus);
        System.out.println("La frase en minúsculas es : " + minus);
    }
    
}
