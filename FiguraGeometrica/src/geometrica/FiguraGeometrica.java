package geometrica;

abstract class FiguraGeometrica {
    protected int valor1;
    
    public abstract double getArea();
    public abstract double getPerimetro();
    
    public int getValor1() {
        return valor1;
    }
    
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
}

