package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private int cantidadDisponible;
    private boolean disponible;

    //Constructor
    public Libro(String titulo, String autor, String genero, String ISBN, int cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = ISBN;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = true;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public boolean isDisponible() {
        return disponible;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //ToString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                ", disponible=" + disponible +
                '}';
    }

    //Metodos

    public void prestar(){
        if(this.cantidadDisponible > 0){
            this.cantidadDisponible--;
            System.out.println("El libro " + this.titulo + " ha sido prestado");
        }else{
            System.out.println("No hay ejemplares disponibles del libro: " + this.titulo);
        }
        comprobarDisponibilidad();
    }

    public void comprobarDisponibilidad(){
        this.disponible = this.cantidadDisponible > 0;
    }

    public void devolver(){
        this.cantidadDisponible++;
        System.out.println("El libro " + this.titulo + " ha sido devuelto");
        comprobarDisponibilidad();
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Genero: " + this.genero);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Cantidad disponible: " + this.cantidadDisponible);
        System.out.println("Disponible: " + this.disponible);
    }
}
