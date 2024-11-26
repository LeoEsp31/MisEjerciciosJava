package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 *
 *
 *
 * @author espin
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    /**
     * Método para crear cuenta pidiéndole los datos al usuario.
     *
     * @return CuentaBancaria object.
     */
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo: ");
        double saldo = leer.nextDouble();
        return new CuentaBancaria(numCuenta, dni,
                saldo);
    }

    /**
     * Método ingresar(double): recibe una cantidad de dinero a ingresar y se le
     * sumará al saldo actual.
     *
     * @param cb
     */
    public void ingresar(CuentaBancaria cb) {
        System.out.println("Monto a ingresar: ");
        double ingreso = leer.nextDouble();
        cb.setSaldoActual(ingreso + cb.getSaldoActual());
        System.out.println("Se ha ingresado la cantidad de: $" + ingreso);
    }

    /**
     * Método retirar(double): recibe una cantidad de dinero a retirar y se le
     * restara al saldo actual.Si la cuenta no tiene la cantidad de dinero a
     * retirar se retirará el máximo posible hasta dejar la cuenta en 0.
     *
     * @param cb
     */
    public void retirar(CuentaBancaria cb) {
        System.out.println("Monto a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > cb.getSaldoActual()) {
            System.out.println("No posee fondos suficientes. Se retira el "
                    + "máximo posible: $" + cb.getSaldoActual());
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - retiro);
            System.out.println("Se ha retirado: $" + retiro);
        }

    }

    /**
     * Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
     * Validar que el usuario no saque más del 20%
     *
     * @param cb
     */
    public void extraccionRapida(CuentaBancaria cb) {
        double maximo = cb.getSaldoActual() * 0.2;
        double retiro;
        do {
            System.out.println("Monto a retirar: (Máximo $" + maximo + ")");
            retiro = leer.nextDouble();
            if (retiro > maximo) {
                System.out.println("No puede retirar más del 20% de su "
                        + "saldo.");
            }
        } while (retiro > maximo);
        cb.setSaldoActual(cb.getSaldoActual() - retiro);
        System.out.println("Se han retirado: $ " + retiro);

    }

    /**
     * Método consultarSaldo: permitirá consultar el saldo disponible en la
     * cuenta.
     *
     * @param cb
     */
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo actual es: $" + cb.getSaldoActual());
    }

    /**
     * Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
     *
     * @param cb
     */
    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("Su número de cuenta es: " + cb.getNumeroCuenta());
        System.out.println("El DNI del cliente es: " + cb.getDniCliente());
    }
}
