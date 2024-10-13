package geometrica;

class Rectangulo extends FiguraGeometrica {
    protected int valor2;
    
    @Override
    public double getArea() {
        return valor1 * valor2; 
    }
    
    @Override
    public double getPerimetro() {
        return 2 * (valor1 + valor2); 
    }
    
    public int getValor2() {
        return valor2;
    }
    
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}
