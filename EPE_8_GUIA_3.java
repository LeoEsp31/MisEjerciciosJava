/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 *
 * @author espin
 */
public class EPE_8_GUIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int leidos = 0;
        int pares = 0;
        int impares = 0;

        do {
            System.out.println("Ingrese un número entero:");
            num = leer.nextInt();
            if (num > 0) {
                leidos++;
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            } else {
                break;
            }
        } while (num % 5 != 0);
        System.out.println("Se leyeron: " + leidos + " números. La cantidad de "
                + "pares es: " + pares + "; Y la cantidad de impares: " + impares);

    }
}
