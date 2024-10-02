package org.example;

public class Main {
    public static void main(String[] args) {
        //Paso 1
        Biblioteca biblioteca = new Biblioteca("Biblioteca POO");
        System.out.println("Bienvenido a la biblioteca " + biblioteca.getNombre());
        //Paso 2
        inicializarBiblioteca(biblioteca);
        System.out.println("Libros Creados");
        //Paso 3
        System.out.println("Libros Disponibles: ");
        mostrarLibrosDisponibles(biblioteca);
        //Paso 4
        System.out.println("Prestar libro");
        prestarLibro(biblioteca, "El principito");
        System.out.println("Libros Disponibles: ");
        mostrarLibrosDisponibles(biblioteca);
        //Paso 5
        System.out.println("Devolver libro");
        devolverLibro(biblioteca, "El principito");
        System.out.println("Libros Disponibles: ");
        mostrarLibrosDisponibles(biblioteca);
        //Paso 6
        System.out.println("Buscar libro por titulo");
        buscarLibroPorTitulo(biblioteca, "El principito");
        //Paso 7
        System.out.println("Buscar libro por autor");
        buscarLibroPorAutor(biblioteca, "J.R.R. Tolkien");
        //Paso 8
        System.out.println("Eliminar libro");
        prestarLibro(biblioteca, "El principito");
        eliminarLibro(biblioteca, "El principito");
        System.out.println("Todos los Libros: ");
        mostrarLibros(biblioteca);
    }

    public static void inicializarBiblioteca(Biblioteca biblioteca){
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", "Infantil", "978-3-16-148410-0", 1);
        Libro libro2 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "Fantasía", "978-3-16-148410-1", 1);
        Libro libro3 = new Libro("El Hobbit", "J.R.R. Tolkien", "Fantasía", "978-84-450-1280-2", 1);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", "978-3-16-148410-3", 1);
        Libro libro5 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía", "978-3-16-148410-4", 1);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
    }

    public static void mostrarLibrosDisponibles(Biblioteca biblioteca){
        biblioteca.mostrarLibrosDisponibles();
    }

    public static void prestarLibro(Biblioteca biblioteca, String titulo){
        biblioteca.prestarLibro(titulo);
    }

    public static void devolverLibro(Biblioteca biblioteca, String titulo){
        biblioteca.devolverLibro(titulo);
    }

    public static void buscarLibroPorTitulo(Biblioteca biblioteca, String titulo){
        Libro libro = biblioteca.buscarLibroPorTitulo(titulo);
        if(libro != null){
            System.out.println("Libro encontrado: " + libro.getTitulo());
        }
        else{
            System.out.println("Libro no encontrado");
        }
    }

    public static void buscarLibroPorAutor(Biblioteca biblioteca, String autor){
        Libro libro = biblioteca.buscarLibroPorAutor(autor);
        if(libro != null){
            System.out.println("Libro encontrado: " + libro.getTitulo());
        }
        else{
            System.out.println("Libro no encontrado");
        }
    }

    public static void eliminarLibro(Biblioteca biblioteca, String titulo){
        biblioteca.eliminarLibro(titulo);
    }

    public static void mostrarLibros(Biblioteca biblioteca){
        for (Libro libro : biblioteca.getLibros()) {
            libro.mostrarInformacion();
        }
    }

}