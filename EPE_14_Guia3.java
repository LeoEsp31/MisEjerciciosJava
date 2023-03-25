/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y
 * para cada familia la cantidad de hijos para averiguar la media de edad de los
 * hijos de todas las familias.
 *
 * @author espin
 */
public class EP_14_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int edades = 0;
        int totalHijos = 0;

        System.out.println("Ingrese la cantidad de familias:");
        int familias = leer.nextInt();

        for (int i = 1; i <= familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la " + i + "°)"
                    + " familia:");
            int hijos = leer.nextInt();
            totalHijos = totalHijos + hijos;
            System.out.println("Familia número " + i + ":");

            for (int j = 1; j <= hijos; j++) {
                System.out.println("Ingrese la edad del " + j + "°) hijo:");
                int edad = leer.nextInt();
                edades = edades + edad;
            }
        }
        float resultado = edades / totalHijos;
        System.out.println("La media de las edades de todos los hijos es: "
                + resultado);
    }
}
