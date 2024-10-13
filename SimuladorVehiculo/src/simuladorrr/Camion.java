package simuladorrr;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitarRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int km) {
        super.acelerar(km);
        if (remolque != null && getVelocidad() + km > 100) {
            System.out.println("¡Demasiado rápido con el remolque!");
        }
    }

    @Override
    public String toString() {
        String resultado = super.toString();
        if (remolque != null) {
            resultado += ", " + remolque.toString();
        }
        return resultado;
    }
}
