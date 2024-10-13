package geometrica;

class Circulo extends FiguraGeometrica {
    private static final double PI = 3.1416;
    
    @Override
    public double getArea() {
        return PI * valor1 * valor1; 
    }
    
    @Override
    public double getPerimetro() {
        return 2 * PI * valor1; 
    }
}

