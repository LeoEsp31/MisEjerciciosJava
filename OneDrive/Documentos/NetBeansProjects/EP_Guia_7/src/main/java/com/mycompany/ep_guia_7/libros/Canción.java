package com.mycompany.ep_guia_7.libros;


/**
 * *
 *
 * @author espin
 */
public class Canción {

    //Desarrollar una clase Cancion con los siguientes atributos: título y autor.
    public String Título;
    public String Autor;

    /**
     * Se deberá definir además dos constructores: uno vacío que inicializa el
     * título y el autor a cadenas vacías
     */
    public Canción() {
        String Título = "";
        String Autor = "";
    }

    /**
     * y otro que reciba como parámetros el título y el autor de la canción.
     *
     * @param Título
     * @param Autor
     */
    public Canción(String Título, String Autor) {
        this.Título = Título;
        this.Autor = Autor;
    }

    /**
     * Se deberán además definir los métodos getters y setters correspondientes.
     *
     * @return
     */
    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

}
