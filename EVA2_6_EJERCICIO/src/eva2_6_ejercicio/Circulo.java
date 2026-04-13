/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_ejercicio;

/**
 *
 * @author Moren
 */
public class Circulo {
    private double radio;
    
    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * (radio * 2);
    }

    public double calcularPerimetro() {
        return Math.PI * Math.pow(radio,2);
    }
    
    @Override
    public String toString() {
        return "-------Circulo-------" + "\n" + 
               "Area: " + calcularArea() + "\n" +
               "Perimetro: " + calcularPerimetro();
    }
}
