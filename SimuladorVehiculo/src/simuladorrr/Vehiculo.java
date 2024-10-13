package simuladorrr;

public abstract class Vehiculo {
    private String matricula;
    private int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int km) {
        this.velocidad += km;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }
}

