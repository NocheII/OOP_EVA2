/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author Moren
 */
public class EVA2_5_EJEMPLO_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("3", "Carlos", "Noche", 100000);
        System.out.println(empleado);
        EmpleadoBase empleadoBase = new EmpleadoBase(1980, "3", "Carlos", "Noche", 100000);
        System.out.println(empleadoBase);
        EmpleadoHonorario empleadoHonorario = new EmpleadoHonorario(50, "3", "Carlos", "Noche", 100000);
        System.out.println(empleadoHonorario);
        // TODO code application logic here
    }
    
}
