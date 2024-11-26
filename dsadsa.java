/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author espin
 */
public class dsadsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int opcion = 0;
        int resultado = 0;
        
        while (opcion != 5){
            System.out.println("Escoja la opcion deseada");
            
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 + numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 - numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 * numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero");
                    numero1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = leer.nextInt();
                    
                    resultado = numero1 / numero2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestra calculadora");
                    break;
            }
        }
    }
    
}
