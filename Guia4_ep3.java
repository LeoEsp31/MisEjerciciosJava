/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es:
 *
 * - *0.86 libras es un 1 € - *1.28611 $ es un 1 € - *129.852 yenes es un 1 €
 *
 * @author espin
 */
public class Guia4_ep3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros:");
        double cantidad = leer.nextFloat();
        
        System.out.println("Ingrese la moneda a convertir: (libras, dólares o "
                + "yenes)");
        String moneda = leer.next();
        Conversor(cantidad, moneda);

    }

    public static void Conversor(double dinero, String moneda) {
        
        double resultado = 0;
        String resultadoMoneda = "";
        
        switch (moneda) {

            case "libras":
            case "LIBRAS":
            case "Libras":
                resultado = (double) dinero * 0.86;
                resultadoMoneda = " Libras.";
                break;
                
            case "dolares":
            case "dólares":
            case "Dólares":
            case "Dolares":
                resultado = (double) dinero * 1.28611;
                resultadoMoneda = " Dólares.";
                break;
                
            case "yenes":
            case "YENES":
            case "Yenes":
                resultado = (double) dinero * 129.852;
                resultadoMoneda = " Yenes.";
                break;
                
            default:
                System.out.println("Ingresó una moneda inválida.");

        }
        
        System.out.println("$" + dinero + " son: " + resultado + resultadoMoneda);
    }

}
