/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_composicion;

/**
 *
 * @author Moren
 */
public class Combustion extends Motor{
    private String tipoCombutible;
    private int cilindros;

    public Combustion() {
        this.tipoCombutible = "";
        this.cilindros = 0;
    }

    public Combustion(String tipoCombutible, int cilindros, double potencia) {
        super(potencia);
        this.tipoCombutible = tipoCombutible;
        this.cilindros = cilindros;
    }

    public String getTipoCombutible() {
        return tipoCombutible;
    }

    public void setTipoCombutible(String tipoCombutible) {
        this.tipoCombutible = tipoCombutible;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Tipo de Combutible: " + tipoCombutible + "\n" +
                "Cilindros:" + cilindros ;
    }
    
    
    
}
