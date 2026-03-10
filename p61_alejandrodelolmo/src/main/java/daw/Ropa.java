package daw;

public abstract class Ropa extends Producto implements SeEnvia{
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Ropa(int codigo, double precio, double iva, String descripcion, String marca) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ropa [marca=" + marca + "]";
    }

    
    
}   
