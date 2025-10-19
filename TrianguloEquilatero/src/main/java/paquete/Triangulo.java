/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        // Fórmula: A = (b*h)/2
        return (this.base * this.altura) / 2;
    }

    public double calcularPerimetro() {
        // Fórmula: P = 3*b (para un triángulo equilátero)
        return 3 * this.base;
    }
}