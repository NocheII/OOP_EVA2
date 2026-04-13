/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia;

/**
 *
 * @author Moren
 */
public class EVA2_3_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------Animal--------");
        Animal animal = new Animal();
        animal.comer();
        System.out.println("--------Mamifero--------");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.tenerPelo();
        System.out.println("--------Persona--------");
        Persona persona = new Persona("Hola mundo!!");
        persona.comer();
        persona.tenerPelo();
        persona.pensar();
        // TODO code application logic here
    }
    
}

class Animal{// BASE, SUPERCLASE, PADRE
    public Animal(){
        System.out.println("Animal!!!");
    }
    
    public void comer(){
        System.out.println("Comer!!!");
    }
}

class Mamifero extends Animal{// DERIVADA, SUBCLASE, HIJO
    public Mamifero(){
        super();// CONSTRUCTOR DEFAULT DE LA SUPERCLASE
        System.out.println("Mamifero!!!");
    }
    
    public void tenerPelo(){
        System.out.println("Tiene pelo!!!");
    }
}

class Persona extends Mamifero{
    public Persona(String mensaje){
        super();// CONSTRUCTOR DEFAULT DE LA SUPERCLASE
        System.out.println(mensaje);
    }
    public void pensar(){
        System.out.println("Piensa!!!");
    }
}
