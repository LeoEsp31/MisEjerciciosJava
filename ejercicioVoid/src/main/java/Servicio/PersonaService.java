package Servicio;

import Entidad.Persona;

public class PersonaService {
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
    
}
