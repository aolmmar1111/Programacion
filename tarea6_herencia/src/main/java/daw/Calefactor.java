package daw;

public class Calefactor {
    private Integer temperatura;
    private boolean estado;

    public Integer getTemperatura() {
        return temperatura;
    }

    public void fijarTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Calefactor(Integer temperatura, boolean estado) {
        this.temperatura = temperatura;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Calefactor [temperatura=" + temperatura + ", estado=" + estado + "]";
    }

}
