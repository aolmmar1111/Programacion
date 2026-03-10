package daw;

public class Pantalon extends Ropa {
    private String talla;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Pantalon(int codigo, double precio, double iva, String descripcion, String marca, String talla) {
        super(codigo, precio, iva, descripcion, marca);
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Pantalon [talla=" + talla + "]";
    }
    
    public void enviar(String direccion){
        System.out.println("Información" + this.toString());
    }
}
