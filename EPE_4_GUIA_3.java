/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *  Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
    muestre su equivalente en romano
 * @author espin
 */
public class EPE_4_GUIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10: ");
        int num = leer.nextInt();
        String romano = "";
        switch(num) {
            case 1 -> romano = "I";
            case 2 -> romano = "II";
            case 3 -> romano = "III";
            case 4 -> romano = "IV";
            case 5 -> romano = "V";
            case 6 -> romano = "VI";
            case 7 -> romano = "VII";
            case 8 -> romano = "VIII";
            case 9 -> romano = "IX";
            case 10 -> romano = "X";   
        }
        System.out.println(num + " convertido a número romano es: " + romano);
    }
    
}
