/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_composicion;

/**
 *
 * @author Moren
 */
public class Direccion {
    private String calle;
    private int numero;
    private String colonia;
    private String Cp;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.Cp = "";
    }
    
    public Direccion(String calle, int numero, String colonia, String Cp) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.Cp = Cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return Cp;
    }

    public void setCp(String Cp) {
        this.Cp = Cp;
    }

    @Override
    public String toString() {
        return "Direccion:" + "\n" +
               "Calle: " + calle + "\n" +
               "Numero: " + numero + "\n"+ 
               "Colonia: " + colonia + "\n" + 
               "Cp: " + Cp;
    }
    
    
    
    
}
