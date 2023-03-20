/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios;
import java.util.Scanner;
/**
 *  Escribir un programa que pida dos números enteros por teclado y calcule
    la suma de los dos. El programa deberá después mostrar el resultado de
    la suma

 * @author espin
 */
public class Ejercicios {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);
    }
}
