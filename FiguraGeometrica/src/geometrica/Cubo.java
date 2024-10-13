package geometrica;

class Cubo extends FiguraGeometrica {
    @Override
    public double getArea() {
        return 6 * valor1 * valor1; 
    }
    
    @Override
    public double getPerimetro() {
        throw new UnsupportedOperationException("Un cubo no tiene un perímetro definido.");
    }
}
