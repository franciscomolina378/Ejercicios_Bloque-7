package persona;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, String id, String estadoCivil, String curso) {
        super(nombre, apellidos, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void matricularEnNuevoCurso(String nuevoCurso) {
        setCurso(nuevoCurso);
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudiante{" +
                "curso='" + curso + '\'' +
                '}';
    }
}
