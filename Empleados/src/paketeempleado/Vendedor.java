package paketeempleado;

import java.util.ArrayList;

public class Vendedor extends Empleado {
    private String coche;
    private String telefonoMovil;
    private String areaVenta;
    private ArrayList<String> listaClientes;
    private double porcentajeComision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, int añosAntiguedad, Empleado supervisor, String coche, String telefonoMovil, String areaVenta, double porcentajeComision) {
        super(nombre, apellidos, dni, direccion, telefono, salario, añosAntiguedad, supervisor);
        this.coche = coche;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<>();
        this.porcentajeComision = porcentajeComision;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public ArrayList<String> getListaClientes() {
        return listaClientes;
    }

    public void darAltaCliente(String cliente) {
        listaClientes.add(cliente);
    }

    public void darBajaCliente(String cliente) {
        listaClientes.remove(cliente);
    }

    @Override
    public void incrementarSalario(double importe) {
        super.incrementarSalario(importe * 0.10);  
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() +
                ", coche='" + coche + '\'' +
                ", telefonoMovil='" + telefonoMovil + '\'' +
                ", areaVenta='" + areaVenta + '\'' +
                ", listaClientes=" + listaClientes +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }
}
