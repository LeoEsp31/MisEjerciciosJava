/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10. El
 * programa debe indicar al usuario si su respuesta es o no correcta. En caso
 * que la respuesta sea incorrecta se debe permitir al usuario ingresar su
 * respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 * la función Math.random() de Java.
 *
 * @author espin
 */
public class EPE_10_Guia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);

        int resultado = n1 * n2;
        int respuesta;

        do {
            System.out.println("Cuánto es " + n1 + " * " + n2 + " ?");
            respuesta = leer.nextInt();
            if (respuesta == resultado) {
                System.out.println(n1 + " * " + n2 + " = " + respuesta + " es CORRECTO");
                break;
            } else {
                System.out.println(n1 + " * " + n2 + " = " + respuesta + " es INCORRECTO");
            }
        } while (respuesta != resultado);

        if (respuesta == resultado) {

        }

    }

}
