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
public class Guia5_EP_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int respuesta, diagonal = 0, diagonalSecundaria = 0, fila = 0, columna
                = 0, esMagica = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese el valor de la fila " + (i + 1) + ")"
                            + ", columna " + (j + 1) + "):");
                    respuesta = leer.nextInt();
                } while (respuesta < 1 || respuesta > 10);
                matriz[i][j] = respuesta;

                if (i == j) {
                    diagonal += matriz[i][j];
                }

                if (i + j == 2) {
                    diagonalSecundaria += matriz[i][j];
                }

                switch (i) {
                    case 0 ->
                        fila += matriz[i][j];
                    case 2 ->
                        columna += matriz[j][i];
                }
            }
        }
        if (fila == diagonal && fila == diagonalSecundaria) {
            esMagica++;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            if (fila != columna) {
                break;
            } else {
                fila = 0;
                columna = 0;
                for (int j = 0; j < 3; j++) {
                    fila += matriz[i][j];
                    columna += matriz[j][i];
                }
                if (fila != columna) {
                    break;
                } else {
                    esMagica++;
                }
            }

        }
        if (esMagica == 4) {
            System.out.println("La matriz es mágica y suma: " + diagonal);
        } else {
            System.out.println("La matriz NO es mágica.");
        }
    }

}
