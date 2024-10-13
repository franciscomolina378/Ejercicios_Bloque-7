package persona;

public class Empleado extends Persona {
    private int añoIncorporacion;
    private String despacho;

    public Empleado(String nombre, String apellidos, String id, String estadoCivil, int añoIncorporacion, String despacho) {
        super(nombre, apellidos, id, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.despacho = despacho;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public void reasignarDespacho(String nuevoDespacho) {
        setDespacho(nuevoDespacho);
    }

    @Override
    public String toString() {
        return super.toString() + ", Empleado{" +
                "añoIncorporacion=" + añoIncorporacion +
                ", despacho='" + despacho + '\'' +
                '}';
    }
}

