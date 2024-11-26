package com.mycompany.ep_3_guia8;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class EP_3_Guia8 {

    /**
     * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de
     * tipo Persona con distintos valores, a continuación, llamaremos todos los
     * métodos para cada objeto, deberá comprobar si la persona está en su peso
     * ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para
     * cada objeto si la persona es mayor de edad.
     *
     * @param args
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        ps.crearPersona(p1);
        if (ps.esMayorDeEdad(p1)) {
            System.out.println(p1.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p1.getNombre() + " es menor de edad.");
        }
        switch (ps.calcularIMC(p1)) {
            case -1 ->
                System.out.println(p1.getNombre() + " está por debajo de"
                        + " su peso ideal.");
            case 0 ->
                System.out.println(p1.getNombre() + " está en su peso "
                        + "ideal.");
            case 1 ->
                System.out.println(p1.getNombre() + " tiene sobrepeso.");
        }

        ps.crearPersona(p2);
        if (ps.esMayorDeEdad(p2)) {
            System.out.println(p2.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p2.getNombre() + " es menor de edad.");
        }
        switch (ps.calcularIMC(p2)) {
            case -1 ->
                System.out.println(p2.getNombre() + " está por debajo de"
                        + " su peso ideal.");
            case 0 ->
                System.out.println(p2.getNombre() + " está en su peso "
                        + "ideal.");
            case 1 ->
                System.out.println(p2.getNombre() + " tiene sobrepeso.");
        }

        ps.crearPersona(p3);
        if (ps.esMayorDeEdad(p3)) {
            System.out.println(p3.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p3.getNombre() + " es menor de edad.");
        }
        switch (ps.calcularIMC(p3)) {
            case -1 ->
                System.out.println(p3.getNombre() + " está por debajo de"
                        + " su peso ideal.");
            case 0 ->
                System.out.println(p3.getNombre() + " está en su peso "
                        + "ideal.");
            case 1 ->
                System.out.println(p3.getNombre() + " tiene sobrepeso.");
        }
        ps.crearPersona(p4);
        if (ps.esMayorDeEdad(p4)) {
            System.out.println(p4.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p4.getNombre() + " es menor de edad.");
        }
        switch (ps.calcularIMC(p4)) {
            case -1 ->
                System.out.println(p4.getNombre() + " está por debajo de"
                        + " su peso ideal.");
            case 0 ->
                System.out.println(p4.getNombre() + " está en su peso "
                        + "ideal.");
            case 1 ->
                System.out.println(p4.getNombre() + " tiene sobrepeso.");
        }

        /**
         * Por último, guardaremos los resultados de los métodos calcularIMC y
         * esMayorDeEdad en distintas variables(arrays), para después calcular
         * un porcentaje de esas 4 personas cuantas están por debajo de su peso,
         * cuantas en su peso ideal y cuantos, por encima, y también
         * calcularemos un porcentaje de cuantos son mayores de edad y cuantos
         * menores. Para esto, podemos crear unos métodos adicionales.
         */
        int[] arregloIMC = new int[4];
        boolean[] arregloEdad = new boolean[4];

        arregloIMC[0] = ps.calcularIMC(p1);
        arregloIMC[1] = ps.calcularIMC(p2);
        arregloIMC[2] = ps.calcularIMC(p3);
        arregloIMC[3] = ps.calcularIMC(p4);

        arregloEdad[0] = ps.esMayorDeEdad(p1);
        arregloEdad[1] = ps.esMayorDeEdad(p2);
        arregloEdad[2] = ps.esMayorDeEdad(p3);
        arregloEdad[3] = ps.esMayorDeEdad(p4);

        ps.porcentajes(arregloIMC, arregloEdad);
    }
}
