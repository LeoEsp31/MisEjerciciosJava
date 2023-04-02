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
 * en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas
 * ) se mantienen sin cambios. a e i o u
 *
 * @ # $ % *
 *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10.
 *
 *
 * @author espin
 */
public class EPE_1_guia_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de caracteres:");
        String secuencia = leer.nextLine();

        System.out.println(codificar(secuencia));

    }

    public static String codificar(String frase) {

        int largoFrase = frase.length();
        String letra;
        String codificada = "";
        for (int i = 0; i <= largoFrase - 1; i++) {
            letra = frase.substring(i, i + 1);

            switch (letra) {
                case "A", "a" ->
                    letra = "@";
                case "E", "e" ->
                    letra = "#";
                case "I", "i" ->
                    letra = "$";
                case "O", "o" ->
                    letra = "%";
                case "U", "u" ->
                    letra = "*";
            }
            codificada = codificada.concat(letra);
        }
        return codificada;
    }
}
