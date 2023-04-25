/**
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 *
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     * devuelve un booleano.
     *
     * @param p
     * @return
     */
    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() <= 18;
    }

    /**
     * Metodo crearPersona(): el método crear persona, le pide los valores de
     * los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona. Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
     * mostrar un mensaje
     *
     * @param p
     */
    public void crearPersona(Persona p) {
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        p.setNombre(nombre);
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        p.setEdad(edad);
        String sexo;
        do {
            System.out.println("Ingrese el sexo: (tipear H, M u O)");
            sexo = leer.next().toUpperCase();
            if (!sexo.equals("H") && !sexo.equals("M")
                    && !sexo.equals("O")) {
                System.out.println("Ingresó un caracter incorrecto.");
            }
        } while (!sexo.equals("H") && !sexo.equals("M")
                && !sexo.equals("O"));
        p.setSexo(sexo);
        System.out.println("Ingrese su peso en kg:");
        double peso = leer.nextDouble();
        p.setPeso(peso);
        System.out.println("Ingrese su altura en metros:");
        double altura = leer.nextDouble();
        p.setAltura(altura);

    }

    /**
     * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     *
     * @param p
     * @return
     */
    public int calcularIMC(Persona p) {
        double IMC = p.getPeso() / (Math.pow(p.getAltura(), 2));
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public void porcentajes(int[] imc, boolean[] edad) {
        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i < imc.length; i++) {
            switch (imc[i]) {
                case -1 ->
                    bajoPeso++;
                case 0 ->
                    pesoIdeal++;
                case 1 ->
                    sobrepeso++;
            }
            if (edad[i]) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("El porcentaje de personas con bajo peso es: "
                + (100 * bajoPeso) / imc.length + "%");
        System.out.println("El porcentaje de personas en su peso ideal es: "
                + (100 * pesoIdeal) / imc.length + "%");
        System.out.println("El porcentaje de personas con sobrepeso es: "
                + (100 * sobrepeso) / imc.length + "%");
        System.out.println("El porcentaje de gente mayor de edad es: "
                + (100 * mayores) / edad.length + "%");
        System.out.println("El porcentaje de gente menor de edad es: "
                + (100 * menores) / edad.length + "%");
    }

}
