package biblioteca;

import libro.Libro;

import java.util.ArrayList;

public class CatalogoLibros {
    private ArrayList<Libro> listaLibros;

    // Constructor Default
    public CatalogoLibros() {
        listaLibros = new ArrayList<>(100);
    }


    public int cantidad() {
        return this.listaLibros.size();
    }

    public boolean estaVacia() {
        return this.listaLibros.isEmpty();
    }

    public Libro obtener(int pos) {
        return this.listaLibros.get(pos);
    }

    public void cambiar(int pos, Libro nuevo) {
        this.listaLibros.set(pos, nuevo);
    }

    public void guardar(Libro libro) {
        this.listaLibros.add(libro);
    }

    public void eliminar(int pos) {
        this.listaLibros.remove(pos);
    }

    public void eliminar(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().toString().matches(isbn)) {
                listaLibros.remove(libro);
            }
        }
    }

    public void imprimir() {
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro);
        }
    }



    public int buscar(Libro libro) {
        return this.listaLibros.indexOf(libro);
    }

    public ArrayList<Libro> buscar(String autor) {
        // Creamos el arraylist nuevo
        ArrayList<Libro> listaAutor = new ArrayList<>();

        // Buscamos cuales libros de la lista de libros son del autor
        for (Libro libro : listaLibros) {
            // Los libros que coincidan los añadimos al arraylist nuevo
            if (libro.getAutor().equals(autor)) {
                listaAutor.add(libro);
            }
        }
        // Devolvemos el arraylist nuevo
        return listaAutor;
    }

    public ArrayList<Libro> buscar(Long isbn) {
        ArrayList<Libro> listaIsbn = new ArrayList<>();
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                listaIsbn.add(libro);
            }
        }
        if (listaIsbn.isEmpty()) {
            return null;
        } else {
            return listaIsbn;
        }
    }


}
