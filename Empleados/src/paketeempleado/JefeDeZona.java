package paketeempleado;

import java.util.ArrayList;

public class JefeDeZona extends Empleado {
    private String despacho;
    private String coche;
    private Secretario secretario;
    private ArrayList<Vendedor> listaVendedores;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, int añosAntiguedad, Empleado supervisor, String despacho, String coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario, añosAntiguedad, supervisor);
        this.despacho = despacho;
        this.coche = coche;
        this.listaVendedores = new ArrayList<>();
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void darAltaVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }

    public void darBajaVendedor(Vendedor vendedor) {
        listaVendedores.remove(vendedor);
    }

    @Override
    public void incrementarSalario(double importe) {
        super.incrementarSalario(importe * 0.20);  
    }

    @Override
    public String toString() {
        return "JefeDeZona{" +
                super.toString() +
                ", despacho='" + despacho + '\'' +
                ", coche='" + coche + '\'' +
                ", secretario=" + (secretario != null ? secretario.getNombre() : "sin secretario") +
                ", listaVendedores=" + listaVendedores +
                '}';
    }
}
