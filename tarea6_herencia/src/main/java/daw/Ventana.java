package daw;

public class Ventana {
    private Persiana persiana;

    public Ventana(String material){
        this.persiana = new Persiana(material);
        
    }

    public void setPersiana(Persiana persiana){
        this.persiana = persiana;
    }

    public Persiana getPersiana (){
        return this.persiana;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
