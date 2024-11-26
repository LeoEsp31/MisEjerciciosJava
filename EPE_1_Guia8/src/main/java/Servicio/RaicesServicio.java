package Servicio;

import Entidad.Raices;

/**
 * Luego, en RaicesServicio las operaciones que se podrán realizar son las
 * siguientes:
 *
 * @author espin
 */
public class RaicesServicio {

    /**
     * Método getDiscriminante(): devuelve el valor del discriminante (double).
     * El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
     *
     * @param r
     * @return
     */
    public double getDiscriminante(Raices r) {
        double discriminante = Math.pow(r.b, 2) - 4 * r.a * r.c;
        return discriminante;
    }

    /**
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos
     * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual
     * que 0.
     *
     * @param r
     * @return
     */
    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) > 0;
    }

    /**
     * Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     *
     * @param r
     * @return
     */
    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    /**
     * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
     * imprime las 2 posibles soluciones.
     *
     * @param r
     */
    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double raiz1 = (-r.b + Math.sqrt(getDiscriminante(r))) / (2 * r.a);
            double raiz2 = (-r.b - Math.sqrt(getDiscriminante(r))) / (2 * r.a);
            System.out.println("Las dos posibles soluciones son: " + raiz1
                    + " y " + raiz2);
        } else {
            System.out.println("La ecuación no tiene dos soluciones reales.");
        }
    }

    /**
     * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
     * única raíz. Es en el caso en que se tenga una única solución posible.
     *
     * @param r
     */
    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double raiz = -r.b / (2 * r.a);
            System.out.println("La única solución es: " + raiz);
        } else {
            System.out.println("La ecuación no tiene una única solución real.");
        }
    }

    /**
     * Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
     * y mostrará por pantalla las posibles soluciones que tiene nuestra
     * ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que
     * devuelvan nuestros métodos y en caso de no existir solución, se mostrará
     * un mensaje. Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)
     * Solo varía el signo delante de -b
     *
     * @param r
     */
    public void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
