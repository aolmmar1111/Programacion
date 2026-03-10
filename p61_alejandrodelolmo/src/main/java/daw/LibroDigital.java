package daw;

public class LibroDigital extends Libro {
    private int numKBytes;

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return "LibroDigital [numKBytes=" + this.numKBytes + "]";
    }

    public LibroDigital(int codigo, double precio, double iva, String descripcion, int isbn, int numKBytes) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numKBytes = numKBytes;
    }
    
    
}
