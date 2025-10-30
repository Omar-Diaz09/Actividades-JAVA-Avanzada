package com.mipaquete; // Reemplazar con el paquete adecuado

public class Triangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    private void calcularArea() {
        this.area = (base * altura) / 2;
    }

    // Para un triángulo equilátero, el perímetro es 3 veces la base.
    private void calcularPerimetro() {
        this.perimetro = 3 * base;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}