/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_ejemplo_herencia;

/**
 *
 * @author Moren
 */
public class Empleado extends Persona{
    private String numeroEmpleado;
    private String puesto;
    private double salario;
    public Empleado(){
        super();
    }

    public Empleado(String numeroEmpleado, String puesto, double salario, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero) {
        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);
        this.numeroEmpleado = numeroEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /*public void imprimirDatosEmpleado(){
        imprimirDatos();
        System.out.println("Numero de Empleado: " + numeroEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }*/
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de Empleado: " + numeroEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }
    
    @Override
    public String toString(){
        String resu = "";
        resu = "------DATOS DEL EMPLEADO------" + "\n" + 
                "Nombre: " + generarNombreCom() + "\n" +
                "RFC: " + getRfc() + "\n" + 
                "Edad: " + getEdad() +
                "Numero de Empleado: " + numeroEmpleado + "\n" +
                "Puesto: " + puesto + "\n" + 
                "Salario: " + salario;
        
        return resu;
    }
    
}
