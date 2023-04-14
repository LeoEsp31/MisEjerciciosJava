package com.mycompany.ep_guia_7.libros;

import java.util.Scanner;

public class Libro {

    public int ISBN;
    public String Título;
    public String Autor;
    public int NumPag;

    public Libro(int ISBN, String Título, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }

    public Libro() {
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número ISBN:");
        ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el título del libro:");
        Título = leer.nextLine();
        System.out.println("Ingrese el autor del libro:");
        Autor = leer.nextLine();
        System.out.println("Ingrese el número de páginas:");
        NumPag = leer.nextInt();

    }

    public void mostrarLibro() {
        System.out.println("El número ISBN del libro es: " + ISBN);
        System.out.println("El título del libro es: " + Título);
        System.out.println("El autor del libro es: " + Autor);
        System.out.println("El número de páginas del libro es: " + NumPag);

    }

}
