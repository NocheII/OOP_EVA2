/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_interfaces;

/**
 *
 * @author Moren
 */
public class EVA2_9_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mensaje menesaje = new Mensaje(); // NO SE PUEDEN CREAR OBJETOS DE UNA CLASE ABSTRACTA
        
        Persona persona = new Persona("Carlos", "Moreno", 18);

        persona.mostrarMensaje();

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Edad: " + persona.getEdad());
        // TODO code application logic here
    }
    
}
