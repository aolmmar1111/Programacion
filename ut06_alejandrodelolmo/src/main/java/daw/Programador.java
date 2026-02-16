package daw;

public class Programador extends Empleado{
    private Categoria categoria;
    public Programador(){
        super();
        this.categoria = Categoria.JUNIOR;
    }

    public Programador(Empleado empleado,Categoria categoria){
        super(empleado, empleado.getSalario());
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Categoria: " + categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
