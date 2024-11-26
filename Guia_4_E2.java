/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author espin
 */
public class Guia_4_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comprobarEdad();
    }

    public static void comprobarEdad() {
        Scanner leer = new Scanner(System.in);
        String nombre, respuesta;
        int edad;

        do {
            System.out.println("Ingrese su nombre:");
            nombre = leer.nextLine();
            System.out.println("Ingrese su edad:");
            edad = leer.nextInt();

            if (edad > 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " NO es mayor de edad.");
            }
            System.out.println("Quiere seguir mostrando personas? (Si/No):");
            respuesta = leer.next();
            if ("Si".equalsIgnoreCase(respuesta)) {
                comprobarEdad();
            } 
        } while (!"No".equalsIgnoreCase(respuesta));

    }

}
