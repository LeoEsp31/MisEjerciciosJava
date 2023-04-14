
import com.mycompany.ep_guia_7.libros.Circunferencia;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        double area_c1 = c1.area();
        double perimetro_c1 = c1.perimetro();
        System.out.println("El área del circulo con el radio ingresado es: "
                + area_c1);
        System.out.println("El perímetro del círculo con el radio ingresado es: "
                + perimetro_c1);
    }

}
