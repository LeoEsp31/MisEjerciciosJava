package EjercicioVoid;

import Entidad.Persona;
import Servicio.PersonaService;

public class EjercicioVoid {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 24);
        PersonaService servicioPersona = new PersonaService();
        servicioPersona.mostrarPersona(p1);
    }

}
