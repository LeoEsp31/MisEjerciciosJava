/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *  Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
    lo siguiente:
    * * * *
    *     *
    *     *
    * * * *

 * @author espin
 */
public class EP_8_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos que tendrá el "
                + "cuadrado: ");
        int N = leer.nextInt();
        
        for (int i = 1; i <= N; i++) { //Dibujar la primera linea
            System.out.print("* ");
        }
        System.out.println(); // Pasar a la siguiente linea
        
        for (int i = 2; i <= N - 1; i++) { //Dibujar el primer elemento de las 
            System.out.print("*");   // lineas intermedias
            
            for (int j = 2; j <= N - 1; j++){ //Hacer los espacios de las lineas 
                System.out.print("  "); // intermedias
            }
            
            System.out.println(" *"); //Dibiujar el ultimo elemento de las 
        }                              // lineas intermedias y saltar de linea
     
        for (int i = 1; i <= N; i++) { // Dibujar la ultima linea 
            System.out.print("* ");
        }
    }
    
}
