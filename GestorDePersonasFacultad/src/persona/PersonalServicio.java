package persona;

public class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String id, String estadoCivil, int añoIncorporacion, String despacho, String seccion) {
        super(nombre, apellidos, id, estadoCivil, añoIncorporacion, despacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        setSeccion(nuevaSeccion);
    }

    @Override
    public String toString() {
        return super.toString() + ", PersonalServicio{" +
                "seccion='" + seccion + '\'' +
                '}';
    }
}
