package paketeempleado;

public class Secretario extends Empleado {
    private String despacho;
    private String numFax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, int añosAntiguedad, Empleado supervisor, String despacho, String numFax) {
        super(nombre, apellidos, dni, direccion, telefono, salario, añosAntiguedad, supervisor);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    @Override
    public void incrementarSalario(double importe) {
        super.incrementarSalario(importe * 0.05);  
    }

    @Override
    public String toString() {
        return "Secretario{" +
                super.toString() +
                ", despacho='" + despacho + '\'' +
                ", numFax='" + numFax + '\'' +
                '}';
    }
}
