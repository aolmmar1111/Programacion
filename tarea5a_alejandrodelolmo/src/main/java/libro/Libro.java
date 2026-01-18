package libro;

import java.time.LocalDate;
import java.util.Objects;

public class Libro {

    // Variables
    private String titulo, autor;
    private final Long isbn;
    private LocalDate fechaPublicacion;
    private boolean disponible;


    // Enum con descripciones
    public enum Genero {
        NOVELA("Historias con elementos mágicos y mundos imaginarios"),
        FICCION("Obra basada en hechos, mundos o personajes imaginarios, no necesariamente reales"),
        POESIA("Composición literaria que expresa sentimientos e ideas mediante ritmo y recursos expresivos"),
        RELATO("Narración breve en prosa que cuenta un hecho concreto con pocos personajes");
        private String descrip;

        Genero(String descrip) {
            this.descrip = descrip;
        }
    }

    private Genero genero;

    // Constructor parametrizado
    public Libro(String titulo, String autor, Long isbn,
                 LocalDate fechaPublicacion, boolean disponible, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;

        String comprobacion = String.valueOf(isbn);
        if (comprobacion.length() != 13) {
            throw new IllegalArgumentException("El numero debe tener 13 digitos");
        }
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.disponible = disponible;
        this.genero = genero;
    }

    // Constructor Default
    public Libro() {
        this.autor = "Miguel de cervantes";
        this.titulo = "Don quijota de la mancha";
        this.isbn = 7564895432146L;
        this.fechaPublicacion = LocalDate.now();
        this.genero = Genero.NOVELA;
        this.disponible = true;
    }


    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getIsbn() {
        return isbn;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // El toString nuevo
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", fechaPublicacion="
                + fechaPublicacion + ", disponible=" + disponible + ", genero=" + genero + "]";
    }

    @Override
    public boolean equals(Object o) {
        // 1. Verificamos si es la misma instancia en memoria
        if (this == o) return true;

        // 2. Verificamos si el objeto es nulo o de una clase diferente
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Comparamos el atributo identificador (isbn)
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        // Genera un código hash único basado en el contenido del ISBN
        return Objects.hash(isbn);
    }


    // Metodo de prestar que cambia a false el estado de disponible del libro
    public void prestar() {
        if (this.disponible) {
            this.disponible = false;
        }
    }

    // Igual que el prestar pero este cambia a true el estado de disponible
    public void devolver() {
        if (!this.disponible) {
            this.disponible = true;
        }
    }


}
