/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E 0-0-4 0-1-2
 * 0-1-E Nota: investigar función equals() y como convertir números a String.
 *
 * @author espin
 */
public class EPE_12_Guia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int u = 0;
        int d = 0;
        int c = 0;
        boolean limite = false;
        do {
            String uStr = (u == 3) ? "E" : Integer.toString(u); //condicion ? valor_verdadero : valor_falso
            String dStr = (d == 3) ? "E" : Integer.toString(d);
            String cStr = (c == 3) ? "E" : Integer.toString(c);
            
            System.out.println(cStr +"-"+dStr+"-"+uStr);
            u++;
            
            if (u==10) {
                u = 0;
                d++;
            }
            if (d==10) {
                d = 0;
                c++;
            }
            if (u==9 && d==9&& c==9) {
                limite = true;
            }
            
        } while (!limite);
        
    }

}
