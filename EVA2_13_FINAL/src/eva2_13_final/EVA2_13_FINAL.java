/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_final;

/**
 *
 * @author Moren
 */
public class EVA2_13_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp = new Empleado("Programador", "Carlos");

        System.out.println("Nombre: " + emp.getNombre());
        System.out.println("Puesto: " + emp.getPuesto());
        // TODO code application logic here
    }
    
}

class Persona{
    private String Nombre;

    public Persona() {
        this.Nombre = "";
    }
    
    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}

class Empleado extends Persona{
    private String puesto;
    
    public Empleado() {
        super();
        this.puesto = "";
    }

    public Empleado(String puesto) {
        this.puesto = puesto;
    }

    public Empleado(String puesto, String Nombre) {
        super(Nombre);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}


