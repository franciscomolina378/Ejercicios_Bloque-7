package geometrica;

class Cuadrado extends FiguraGeometrica {
    @Override
    public double getArea() {
        return valor1 * valor1; 
    }
    
    @Override
    public double getPerimetro() {
        return 4 * valor1; 
    }
}
