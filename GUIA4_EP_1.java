package com.mycompany.ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author espin
 */
public class GUIA4_EP_1 {

    /**
     * Crea una aplicación que le pida dos números al usuario y este pueda
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
     * tener una función para cada operación matemática y deben devolver sus
     * resultados para imprimirlos en el main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int respuesta = 0;

        System.out.println("Calculadora by Leo");
        System.out.println("Ingrese el primer número:");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int n2 = leer.nextInt();

        do {
            System.out.println("Ingrese la operación que desea realizar:");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            respuesta = leer.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println(Sumar(n1, n2));
                    break;
                case 2:
                    System.out.println(Restar(n1, n2));
                    break;
                case 3:
                    System.out.println(Multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println(Dividir(n1, n2));
                    break;
                default:
                    System.out.println("Error: Elección no válida");
            }
        } while (respuesta != 5);

    }

    public static int Sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int Restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int Multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static int Dividir(int a, int b) {
        int resultado = a / b;
        return resultado;
    }

}
