/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales
 * acentuadas) se mantienen sin cambios. a e i o u
 *
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10
 *
 * @author espin
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de caracteres terminada en "
                + "punto:");
        String secuencia = leer.nextLine();
        int longitud = secuencia.length();
        String codificada = "";

        for (int i = 0; i <= longitud - 1; i++) {
            String caracter = secuencia.substring(i, i + 1);
            switch (caracter) {
                case "a":
                case "á":
                    caracter = "@";
                    break;
                case "e":
                case "é":
                    caracter = "#";
                    break;
                case "i":
                case "í":
                    caracter = "$";
                    break;
                case "o":
                case "ó":
                    caracter = "%";
                    break;
                case "u":
                case "ú":
                    caracter = "*";
                    break;
                case ".":
                    break;
                default:

            }
            codificada = codificada.concat(caracter);
        }
        System.out.println(codificada);

    }
}
