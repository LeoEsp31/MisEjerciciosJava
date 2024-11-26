/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**Realizar un programa que complete un vector con los N primeros números de la 
 * sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión 
 * de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. 
* Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función 
* que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar
* a ese valor.


 *
 * @author espin
 */
public class Guia5_EPE_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("De qué tamaño será el vector?");
        int N = leer.nextInt();
        int[] vectorFib = new int[N];
        vectorFib[0] = 1;
        vectorFib[1] = 1;
        for (int i = 2; i < N; i++) {
            vectorFib[i] = vectorFib[i-1] + vectorFib[i-2];
        }
        System.out.println("Los primeros " + N + " números de la sucesión de "
                + "Fibonacci son: ");
        
        for (int i = 0; i < N; i++) {
            System.out.print(vectorFib[i] + " ");
        }
        
    }
    
}
