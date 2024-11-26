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
public class EP_5_guia2 {

    /**Escribir un programa que lea un número entero por teclado y muestre por
     * pantalla el doble, el triple y la raíz cuadrada de ese número
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();
        int doble =  num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del número ingresado es: " + doble + ", el"
                + "triple es: " + triple + " y su raiz cuadrada es: " + raiz);
    }
    
}
