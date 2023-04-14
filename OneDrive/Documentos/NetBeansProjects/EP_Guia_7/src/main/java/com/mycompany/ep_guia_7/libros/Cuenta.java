package com.mycompany.ep_guia_7.libros;

import java.util.Scanner;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.

 * @author espin
 */
public class Cuenta {
    private double saldo;
    private String titular;
    public void retirar_dinero() {
        saldo = 1000;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        titular = leer.next();
        
        System.out.println("Cuánto desea retirar?:");
        double retiro = leer.nextDouble();
        
        if (saldo < retiro) {
            System.out.println("No tiene fondos suficientes.");
        } else {
            saldo -= retiro;
        }
        
        System.out.println("Su saldo actual es :" + saldo);
    }
}
