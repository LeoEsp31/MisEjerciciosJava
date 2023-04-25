package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 * La tabla de caracteres es la siguiente:
 *
 * @author espin
 */
public class NifServicio {

    Scanner leer = new Scanner(System.in);

    /**
     * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
     * letra que le corresponderá.Una vez calculado, le asigna la letra que le
     * corresponde según
     *
     * @param nif
     */
    public void crearNif(NIF nif) {
        System.out.println("Ingrese su DNI:");
        long DNI = leer.nextLong();
        int resto = (int) DNI % 23;
        nif.setDNI(DNI);
        String[] Nif = new String[23];
        Nif[0] = "T";
        Nif[1] = "R";
        Nif[2] = "W";
        Nif[3] = "A";
        Nif[4] = "G";
        Nif[5] = "M";
        Nif[6] = "Y";
        Nif[7] = "F";
        Nif[8] = "P";
        Nif[9] = "D";
        Nif[10] = "X";
        Nif[11] = "B";
        Nif[12] = "N";
        Nif[13] = "J";
        Nif[14] = "Z";
        Nif[15] = "S";
        Nif[16] = "Q";
        Nif[17] = "V";
        Nif[18] = "H";
        Nif[19] = "L";
        Nif[20] = "C";
        Nif[21] = "K";
        Nif[22] = "E";

        String letraC = Nif[resto];
        nif.setLetra(letraC);
    }

    /**
     * Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion
     * y la letra en mayúscula; por ejemplo: 00395469-F).La letra
     * correspondiente al dígito verificador se calculará a traves de un método
     * que funciona de la siguiente manera: Para calcular la letra se toma el
     * resto de dividir el número de DNI por 23 (el resultado debe ser un número
     * entre 0 y 22). El método debe buscar en un array (vector) de caracteres
     * la posición que corresponda al resto de la división para obtener la letra
     * correspondiente.
     *
     * @param n
     */
    public void mostrar(NIF n) {
        System.out.println("Su NIF es: " + n.getDNI() + "-" + n.getLetra());
    }
}
