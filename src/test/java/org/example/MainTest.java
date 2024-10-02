package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Biblioteca biblioteca = new Biblioteca("Biblioteca POO");

    @BeforeEach
    void setUp() {
        Main.inicializarBiblioteca(biblioteca);
    }

    @Test
    void testMain() {
        assertEquals("Biblioteca POO", biblioteca.getNombre());
    }

    @Test
    void buscarLibroNoExistente() {
        Main.buscarLibroPorTitulo(biblioteca, "LibroNoExistente");
    }

    @Test
    void buscarLibroPorAutorNoExistente(){
        Main.buscarLibroPorAutor(biblioteca, "AutorNoExistente");
    }

    @Test
    void eliminarLibroNoExistente() {
        Main.eliminarLibro(biblioteca, "LibroNoExistente");
    }

    @Test
    void agregarLibroRepetido() {
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", "Infantil", "978-3-16-148410-0", 3);
        biblioteca.agregarLibro(libro);
        Libro libroTest = biblioteca.buscarLibroPorTitulo("El principito");
        assertEquals(4, libroTest.getCantidadDisponible());
    }
}