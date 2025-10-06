package org.example.practicaobligatoriajson.Model;

public class Pelicula {

    private int ID;
    private String Titulo;
    private String Fecha;
    private String Director;
    private String Genero;


    public Pelicula(int ID, String titulo, String fecha, String director, String genero) {
        this.ID = ID;
        Titulo = titulo;
        Fecha = fecha;
        Director = director;
        Genero = genero;
    }

    public Pelicula() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    @Override
    public String toString() {
        return getTitulo();
    }
}
