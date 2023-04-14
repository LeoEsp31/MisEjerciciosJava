package com.mycompany.ep_guia_7.libros;

import java.util.Scanner;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos.
 *
 * @author espin
 */
public class Punto {

    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public void crearPunto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1:");
        x1 = leer.nextDouble();
        System.out.println("Ingrese el valor de x2:");
        x2 = leer.nextDouble();
        System.out.println("Ingrese el valor de y1:");
        y1 = leer.nextDouble();
        System.out.println("Ingrese el valor de y2:");
        y2 = leer.nextDouble();

    }

    public double calcular() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2)
                + Math.pow((y2 - y1), 2));
        return distancia;
    }
}
