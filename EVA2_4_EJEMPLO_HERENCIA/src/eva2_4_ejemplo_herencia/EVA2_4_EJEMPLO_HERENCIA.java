/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejemplo_herencia;

/**
 *
 * @author Moren
 */
public class EVA2_4_EJEMPLO_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", "Moreno", "Noche", "ADA9ERA8689", 19, 'H');
        persona.imprimirDatos();
        Empleado empleado = new Empleado("1", "Gerente", 1000000, "Carlos", "Moreno", "Noche", "ADA9ERA8689", 19, 'H');
        empleado.imprimirDatos();
        System.out.println(empleado.toString());
        System.out.println(empleado);
        // TODO code application logic here
    }
    
}
