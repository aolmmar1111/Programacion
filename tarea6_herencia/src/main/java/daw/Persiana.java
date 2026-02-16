package daw;

public class Persiana {
    private String material;
    private boolean estado;

    public Persiana (String material){
        this.material = material;
        this.estado = true;
    }

    public boolean isEstado(){
        return this.estado;
    }

    public void subirPersiana(){
        this.estado = true;
    }

    public void bajarPersiana(){
        this.estado = false;
    }
}