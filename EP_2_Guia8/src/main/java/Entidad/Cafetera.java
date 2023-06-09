/**
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades
 */
package Entidad;

/**
 * con los atributos capacidadMáxima (la cantidad máxima de café que puede
 * contener la cafetera) y cantidadActual (la cantidad actual de café que hay en
 * la cafetera). Agregar constructor vacío y con parámetros así como setters y
 * getters.
 *
 * @author espin
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}
