/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author Moren
 */
public class EmpleadoHonorario extends Empleado {
    private int horas;
    
    public EmpleadoHonorario() {
        super();
        this.horas = 0;
    }

    public EmpleadoHonorario(int horas) {
        this.horas = horas;
    }

    public EmpleadoHonorario(int horas, String numeroEmpleado, String nombre, String apellido, double salario) {
        super(numeroEmpleado, nombre, apellido, salario);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    @Override
    public double calcularSalario() {
        return getSalario() * horas; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        String resu = super.toString() + "\n" +
                "Horas: " + horas + "\n" +
                "Salario Total: " + calcularSalario();
        return resu;
    }
    
    
    
}
