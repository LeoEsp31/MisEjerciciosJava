package com.mycompany.ep_guia_7.newpackage;

import com.mycompany.ep_guia_7.libros.Operacion;

public class NewMain {

    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println("La suma de los dos números es: " + op1.sumar());
        System.out.println("La resta de los dos números es: " + op1.restar());
        System.out.println("La multiplicación de los dos números es: " + op1.multiplicar());
        System.out.println("La división de los dos números es: " + op1.dividir());

    }

}
