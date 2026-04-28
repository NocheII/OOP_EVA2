/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_composicion;

/**
 *
 * @author Moren
 */
public class EVA2_16_COMPOSICION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Universidad", 500, "Centro","3010");
        Persona persona = new Persona("Juan", "Perez", 50, direccion);
        System.out.println(persona);
        ///
        Persona persona2 = new Persona("Pedro", "Paramo", 80, "4ta", 25, "centro",3010);
        System.out.println(persona2);
        
        //CAMBIAR DIRECCION
        Direccion temp = persona.getDireccion();
        persona.getDireccion().setCalle("Tecnologico");
        persona.getDireccion().setNumero(50);
        persona.getDireccion().setColonia("Santo Ninio");
        persona.getDireccion().setCp("33000");
        System.out.println(persona);
    }
    
}
