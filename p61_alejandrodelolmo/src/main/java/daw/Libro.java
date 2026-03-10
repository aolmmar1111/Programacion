package daw;

public class Libro extends Producto {
    private int isbn;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Libro(int codigo, double precio, double iva, String descripcion, int isbn) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + isbn;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn != other.isbn)
            return false;
        return true;
    }
    
    
}