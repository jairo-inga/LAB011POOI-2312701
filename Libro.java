package semana15pooi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Libro {
    int nro;
    String nombre;
    String autor;
    double precio;
    int cantidad;

    public Libro(int nro, String nombre, String autor, double precio, int cantidad) {
        this.nro = nro;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("Nro: %d, Nombre: %s, Autor: %s, Precio: %.2f, Cantidad: %d",
                             nro, nombre, autor, precio, cantidad);
    }
}

class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void agregarLibro(int nro, String nombre, String autor, double precio, int cantidad) {
        Libro libro = new Libro(nro, nombre, autor, precio, cantidad);
        libros.add(libro);
        System.out.println("Libro '" + nombre + "' agregado correctamente.");
    }

    public void eliminarLibro(String nombre) {
        libros.removeIf(libro -> libro.nombre.equals(nombre));
        System.out.println("Libro '" + nombre + "' eliminado correctamente.");
    }

    public void editarLibro(String nombre, double nuevoPrecio, int nuevaCantidad) {
        for (Libro libro : libros) {
            if (libro.nombre.equals(nombre)) {
                libro.precio = nuevoPrecio;
                libro.cantidad = nuevaCantidad;
                System.out.println("Libro '" + nombre + "' editado correctamente.");
                return;
            }
        }
        System.out.println("Libro '" + nombre + "' no encontrado.");
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.nombre.equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public String buscarAutorPorLibro(String libro) {
        for (Libro l : libros) {
            if (l.nombre.equals(libro)) {
                return l.autor;
            }
        }
        return null;
    }

    public void ordenarLibrosPorAutor() {
        Collections.sort(libros, Comparator.comparing(libro -> libro.autor));
        System.out.println("Libros ordenados por autor.");
    }
}





