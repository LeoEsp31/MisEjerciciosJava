package Entidad;

/**
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con
 * su correspondiente letra (NIF). Los atributos serán el número de DNI (entero
 * largo) y la letra (String o char) que le corresponde. En NIFService se
 * dispondrá de los siguientes métodos: Métodos getters y setters para el número
 * de DNI y la letra.
 *
 * @author espin
 */
public class NIF {

    private long DNI;
    private String letra;

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}
