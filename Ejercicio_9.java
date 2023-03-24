/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**Escriba un programa que lea 20 números. Si el número leído es igual a cero 
 * se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
 * El programa deberá calcular y mostrar el resultado de la suma de los números 
 * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso 
 * de la sentencia break.

 *
 * @author espin
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese el " +(contador + 1) + "°) número: ");
            int num = leer.nextInt();
            contador++;
            if (num > 0) {
                suma = suma + num;
            }
            if (num == 0) {
                System.out.println("Se capturó el número 0.");
                break;
            }
            
        } while (contador<20);
        System.out.println("La suma de los números positivos ingresados es: "
                + suma);
    }  
    
}
