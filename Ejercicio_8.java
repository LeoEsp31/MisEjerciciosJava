/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 
* 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 *
 * @author espin
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean esValido = false;
        int num;
        while (!esValido) {
             System.out.println("Ingrese una nota entre 0 y 10:");
             num = leer.nextInt();
             if (num>=0&&num<=10){
                 esValido = true;
             }
        }
       
    }
    
}
