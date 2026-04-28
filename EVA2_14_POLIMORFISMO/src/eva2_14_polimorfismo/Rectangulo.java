/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_polimorfismo;

/**
 *
 * @author Moren
 */
public class Rectangulo implements Figuras {
    private double largo;
    private double alto;

    public Rectangulo() {
        this.largo = 0;
        this.alto = 0;
    }
    
    public Rectangulo(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    public double calcularArea(){
        return largo * alto;
    }
    
    @Override
    public double calcularPerimetro(){
        return (largo * 2) + (alto * 2);
    }
    
    
    
    
}
