package com.mycompany.ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
 * usuario, validando que el primer número múltiplo del segundo e imprima si el
 * primer número es múltiplo del segundo, sino informe que no lo son
 *
 * @author espin
 */
public class Ejercicio_12_Guia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " NO es múltiplo de " + num2);
        }
    }
}
