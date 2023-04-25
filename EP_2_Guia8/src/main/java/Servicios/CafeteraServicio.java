/**
 * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima.
 *
 * @author espin
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    /**
     * Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la
     * taza.
     *
     * @param cafetera
     */
    public void servirTaza(Cafetera cafetera) {
        System.out.println("De qué tamaño es la taza? (ml)");
        int tamaño = leer.nextInt();
        if (cafetera.getCantidadActual() < tamaño) {
            System.out.println("La taza no se llenó. Se ha servido: "
                    + cafetera.getCantidadActual() + "ml.");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Se ha llenado la taza.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamaño);
        }
    }

    /**
     * Método vaciarCafetera(): pone la cantidad de café actual en cero.
     *
     * @param cafetera
     */
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera.");
    }

    /**
     * agregarCafe(int): se le pide al usuario una cantidad de café, el método
     * lo recibe y se añade a la cafetera la cantidad de café indicada.
     *
     * @param cafetera
     */
    public void agregarCafe(Cafetera cafetera) {
        int cantidad;
        int capacidadPermitida;
        do {
            System.out.println("Qúe cantidad de café quiere ingresar? (ml)");
            cantidad = leer.nextInt();
            capacidadPermitida = cafetera.getCapacidadMaxima()
                    - cafetera.getCantidadActual();
            if (cantidad > capacidadPermitida) {
                System.out.println("La cantidad máxima para ingresar es: "
                        + capacidadPermitida + "ml.");
            } else {
                cafetera.setCantidadActual(cantidad
                        + cafetera.getCantidadActual());
                System.out.println("Se han agregado: " + cantidad + " ml. La "
                        + "cafetera tiene: " + cafetera.getCantidadActual()
                        + "ml.");
            }
        } while (cantidad > capacidadPermitida);

    }

}
