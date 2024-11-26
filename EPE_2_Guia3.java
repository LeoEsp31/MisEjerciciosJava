/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *  Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
    diferente a cada una. A continuación, realizar las instrucciones
    necesarias para que: B tome el valor de C, C tome el valor de A, A tome
    el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
    valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * @author espin
 */
public class EPE_2_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A, B, C, D;
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        System.out.println("A" + "=" + A);
        System.out.println("B" + "=" + B);
        System.out.println("C" + "=" + C);
        System.out.println("D" + "=" + D);
        System.out.println();
        
        int aux;
        aux = D;
        D = B;
        B = C;
        C = A;
        A = aux;
        
        System.out.println("A" + "=" + A);
        System.out.println("B" + "=" + B);
        System.out.println("C" + "=" + C);
        System.out.println("D" + "=" + D);
    }
    
}
