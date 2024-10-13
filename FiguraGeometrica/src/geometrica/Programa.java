package geometrica;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Ingrese el radio del círculo:");
        FiguraGeometrica circulo = new Circulo();
        circulo.setValor1(scanner.nextInt());
        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Perímetro del círculo: " + circulo.getPerimetro());

        
        System.out.println("Ingrese el lado del cuadrado:");
        FiguraGeometrica cuadrado = new Cuadrado();
        cuadrado.setValor1(scanner.nextInt());
        System.out.println("Área del cuadrado: " + cuadrado.getArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());

        
        System.out.println("Ingrese el largo del rectángulo:");
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setValor1(scanner.nextInt());
        System.out.println("Ingrese el ancho del rectángulo:");
        rectangulo.setValor2(scanner.nextInt());
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());

        
        System.out.println("Ingrese la base del triángulo:");
        Triangulo triangulo = new Triangulo();
        triangulo.setValor1(scanner.nextInt());
        System.out.println("Ingrese la altura del triángulo:");
        triangulo.setValor2(scanner.nextInt());
        System.out.println("Área del triángulo: " + triangulo.getArea());
        System.out.println("Perímetro del triángulo (equilátero): " + triangulo.getPerimetro());

        
        System.out.println("Ingrese el lado del cubo:");
        FiguraGeometrica cubo = new Cubo();
        cubo.setValor1(scanner.nextInt());
        System.out.println("Área del cubo: " + cubo.getArea());

        try {
            System.out.println("Perímetro del cubo: " + cubo.getPerimetro());
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}


