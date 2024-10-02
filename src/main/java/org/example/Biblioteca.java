package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        if(buscarLibroPorTitulo(libro.getTitulo()) == null){
            this.libros.add(libro);
        }
        else{
            sumarCantidad(libro.getTitulo(), libro.getCantidadDisponible());
        }
    }

    public void sumarCantidad(String titulo, int cantidad){
        for (Libro libro : this.libros){
            if(libro.getTitulo().equals(titulo)){
                libro.setCantidadDisponible(libro.getCantidadDisponible() + cantidad);
            }
        }
    }

    public void mostrarLibrosDisponibles(){
        for (Libro libro : this.libros) {
            if(libro.isDisponible()){
                libro.mostrarInformacion();
            }
        }
    }

    public Libro buscarLibroPorTitulo(String titulo){
        for (Libro libro : this.libros){
            if(libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibroPorAutor(String autor){
        for (Libro libro : this.libros){
            if(libro.getAutor().equals(autor)){
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if(libro != null && libro.getCantidadDisponible() == 0){
            this.libros.remove(libro);
            System.out.println("Libro eliminado");
        }
        else if(libro != null && libro.getCantidadDisponible() > 0){
            System.out.println("No se puede eliminar el libro porque hay copias prestadas");
        }
        else{
            System.out.println("Libro no encontrado");

        }
    }

    public void prestarLibro(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if(libro != null){
            libro.prestar();
        }
    }

    public void devolverLibro(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if(libro != null){
            libro.devolver();
        }
    }

    //Getters
    public List<Libro> getLibros() {
        return libros;
    }

    public String getNombre() {
        return nombre;
    }
}
