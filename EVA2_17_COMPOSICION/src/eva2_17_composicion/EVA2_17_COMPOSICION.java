/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_composicion;

/**
 *
 * @author Moren
 */
public class EVA2_17_COMPOSICION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrico motorElectrico = new Electrico("Litio", 100, 100);
        Vehiculo vehiculo = new Vehiculo("Tesla", "X", 2025, motorElectrico);
        System.out.println("VEHICULO ELECTRICO");
        System.out.println(vehiculo);
        Combustion motorGasolina = new Combustion("Gasolina", 5, 400);
        Vehiculo tradicional = new Vehiculo("Ford", "Mustang", 2025, motorGasolina);
        System.out.println("VEHICULO DE GASOLINA");
        System.out.println(tradicional);
        // TODO code application logic here
    }
    
}
