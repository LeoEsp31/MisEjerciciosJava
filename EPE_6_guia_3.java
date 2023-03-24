package com.mycompany.ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.

 * @author espin
 */
public class EPE_6_guia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estaturas de personas que "
                + "ingresará:");
        int N = leer.nextInt();
        double altura;
        double suma = 0;
        int metroSesenta=0;
        double suma2 = 0;
        
        for (int i = 1; i <=N;i++) {
            System.out.println("Ingrese la estatura de la " + i + ") persona "
                    + "en metros:");
            altura = leer.nextDouble();
            suma = suma + altura;
            if (altura < 1.60) {
                metroSesenta++;
                suma2 = suma2 + altura;
            }
        }
        System.out.println("El promedio de estaturas que se encuentran por "
                + "debajo de 1.60 es: " + (suma2 / metroSesenta) + " mts.");
        System.out.println("El promedio general es : " + (suma / N) + " mts.");
    }
    
}
