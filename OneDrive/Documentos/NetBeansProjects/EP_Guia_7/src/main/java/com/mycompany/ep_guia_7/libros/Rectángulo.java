package com.mycompany.ep_guia_7.libros;

import java.util.Scanner;

// Crear una clase Rectángulo
public class Rectángulo {
    //que modele rectángulos por medio de un atributo
    //privado base y un atributo privado altura.

    private double base;
    private double altura;

    /*
    *Se deberán además definir los métodos getters, setters y constructores
    *correspondientes.
     */
    public Rectángulo() {
        base = 0;
        altura = 0;
    }

    public Rectángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * La clase incluirá un método para crear el rectángulo con los datos del
     * Rectángulo dados por el usuario.
     */
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base en cm:");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura en cm:");
        altura = leer.nextDouble();
    }

    /**
     * También incluirá un método para calcular la superficie del rectángulo
     * Superficie = base * altura
     *
     * @return
     */
    public double calcularSuperficie() {

        double superficie = base * altura;
        return superficie;
    }

    /**
     * y un método para calcular el perímetro del rectángulo. Perímetro = (base
     * + altura)
     *
     * @return perimetro
     */
    public double calcularPerimetro() {

        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

    /**
     * Por último, tendremos un método que dibujará el rectángulo mediante
     * asteriscos usando la base y la altura.
     */
    public void dibujar() {

        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 1; i < altura - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < base - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
    }

}
