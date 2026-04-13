/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author Moren
 */
public class EmpleadoBase extends Empleado {
    private int annioIngreso;
    
    public EmpleadoBase(){
        super();
        this.annioIngreso = 0;
    }

    public EmpleadoBase(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    public EmpleadoBase(int annioIngreso, String numeroEmpleado, String nombre, String apellido, double salario) {
        super(numeroEmpleado, nombre, apellido, salario);
        this.annioIngreso = annioIngreso;
    }

    public int getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }
    
    public int antiguedad(){
        int anti = 2026 - annioIngreso;
        int cinco = anti / 5;
        return cinco;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * (1 + (antiguedad() * 0.1)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        String resu = super.toString() + "\n" +
                "Antiguedad: " + antiguedad() + "\n" +
                "Salario Total: " + calcularSalario();
        return resu;
    }
    
    
    
}
