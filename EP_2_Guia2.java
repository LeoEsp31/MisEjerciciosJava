/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;
import java.util.Scanner;
/**
 *  Escribir un programa que pida tu nombre, lo guarde en una variable y lo
    muestre por pantalla.
 * @author espin
 */
public class EP_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = leer.next();
        System.out.println("El nombre es: " + nombre);
       
    }
    
}
