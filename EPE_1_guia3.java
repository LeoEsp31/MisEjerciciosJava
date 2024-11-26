/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *  Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
    ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
    equivalente: 1 día, 2 horas.
 * @author espin
 */
public class EPE_1_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a convertir: ");
        int min = leer.nextInt();
        int horas = min / 60;
        int dias = horas / 24;
        horas = horas % 24;
        System.out.println( min + " minutos son equivalentes a: " + dias + 
                " días, " + horas + " horas.");
        
                
    }
    
}
