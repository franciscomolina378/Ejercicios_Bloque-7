package persona;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String id, String estadoCivil, int añoIncorporacion, String despacho, String departamento) {
        super(nombre, apellidos, id, estadoCivil, añoIncorporacion, despacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        setDepartamento(nuevoDepartamento);
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesor{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
