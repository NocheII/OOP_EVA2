/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_abstract;

/**
 *
 * @author Moren
 */
public class Triangulo extends Figuras{
    private double base;
    private double high;
    private double Lado1;
    private double Lado2;
    private double Lado3;
    
    public Triangulo() {
        this.base = 0;
        this.high = 0;
        this.Lado1 = 0;
        this.Lado2 = 0;
        this.Lado3 = 0;
    }

    public Triangulo(double base, double high, double Lado1, double Lado2, double Lado3) {
        this.base = base;
        this.high = high;
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
    }

    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double calcularArea() {
        return (base * high)/2;
    }

    @Override
    public double calcularPerimetro() {
        return Lado1 + Lado2 + Lado3;
    }
    
    @Override
    public String toString() {
        return "-------Triangulo-------" + "\n" + 
               "Area: " + calcularArea() + "\n" +
               "Perimetro: " + calcularPerimetro();
    }
    
    
    
    
}
