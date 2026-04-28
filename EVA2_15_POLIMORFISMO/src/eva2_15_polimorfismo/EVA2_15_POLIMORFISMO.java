/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author Moren
 */
public class EVA2_15_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Gerente", 100000, "Juan", "Perez", 45);
        Cliente cliente = new Cliente("ASDW345147", 5000, "Restaurante la cucaracha crocante","", 1);
        Persona persona = new Persona("Pedro", "Paramo", 50);
        
        Persona perso = empleado;
        System.out.println("EMPLEADO DISFRAZADO DE PERSONA");
        imprimir(perso);
        Persona perso2 = cliente;
        System.out.println("CLIENTE DISFRAZADO DE PERSONA");
        imprimir(perso2);
        
        
        Cliente cl = (Cliente)perso2;
        Cliente cl2 = (Cliente)perso;
        // TODO code application logic here
    }
    
    public static void imprimir(Persona perso){
        System.out.println(perso.generarDatos());
        if(perso instanceof Empleado)
            System.out.println("Empleado");
        else if(perso instanceof Cliente)
            System.out.println("Cliente");
        else if(perso instanceof Persona)
            System.out.println("Persona");
    }
    
}
