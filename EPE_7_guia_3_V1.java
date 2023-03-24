/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.

 *
 * @author espin
 */
public class EPE_7_guia_3_V1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean esValido = false;
        int n = 0;
        while(!esValido) {
            System.out.println("Cuántos números va a ingresar?: ");
            n = leer.nextInt();
        
        if (n>0){
            esValido =true;
        }
        }
        
        float min = 999999999;
        float suma = 0;
        
        for (int i = 1; i<=n;i++) {
            System.out.println("Ingrese el valor del " +i+"°) número: ");
            float num = leer.nextFloat();
            suma = suma + num;
            if (num>min) {
                min = num;
            }
            
            
        }
        System.out.println("El promedio de los números ingresados es: " + 
                (suma/n)+ ". Y el mínimo es: " + min);
    }
    
}
