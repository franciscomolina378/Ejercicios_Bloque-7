package persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private String id;
    private String estadoCivil;

    public Persona(String nombre, String apellidos, String id, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getId() {
        return id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id='" + id + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}

