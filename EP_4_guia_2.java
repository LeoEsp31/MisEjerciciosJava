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
public class EP_4_guia_2 {

    /**Dada una cantidad de grados centígrados se debe mostrar su equivalente en
     * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centígrados: ");
        float gradosC = leer.nextFloat();
        float F = 32 + (9 * (gradosC / 5));
        System.out.println("Su equivalente en grados Fahrenheit es: " + F + "°");
    }
    
}
