package geometrica;

class Triangulo extends FiguraGeometrica {
    protected int valor2;
    
    @Override
    public double getArea() {
        return (valor1 * valor2) / 2.0; 
    }
    
    @Override
    public double getPerimetro() {
       
        return 3 * valor1; 
    }
    
    public int getValor2() {
        return valor2;
    }
    
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}

