package daw;

public class Empleado extends Persona {
    private double salario;

    public Empleado (Persona persona, double salario){
        super(persona.getNombre(),persona.getNif(),persona.getEdad());
        this.salario = salario;
    }

    public Empleado (){
        super();
        this.salario =  1000.0;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Salario: " + this.salario;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario (double salario){
        this.salario += salario;
    }
}
