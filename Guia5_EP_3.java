/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**Recorrer un vector de N enteros contabilizando cuántos números son de 1 
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 *
 * @author espin
 */
public class Guia5_EP_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int tamano, cont, cont2, cont3, cont4, cont5;

        System.out.println("Ingrese el tamaño del vector");
        tamano = leer.nextInt();

        int[] v = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            v[i] = (int) (Math.random() * 100000 + 1);
        }

        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + v[i] + "]");
        }

        cont = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        for (int i = 0; i < tamano; i++) {
            if (v[i] > 0 && v[i] < 10) {
                cont++;
            } else if (v[i] >= 10 && v[i] < 100) {
                cont2++;
            } else if (v[i] >= 100 && v[i] < 1000) {
                cont3++;
            } else if (v[i] >= 1000 && v[i] < 10000) {
                cont4++;
            } else if (v[i] >= 10000 && v[i] < 100000) {
                cont5++;
            }
        }
        
        System.out.println("Numeros de un digito: "+cont);
        System.out.println("Numeros de dos digitos: "+cont2);
        System.out.println("Numeros de tres digitos: "+cont3);
        System.out.println("Numeros de cuatro digitos: "+cont4);
        System.out.println("Numeros de cinco digitos: "+cont5);
    }
    
}
