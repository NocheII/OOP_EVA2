/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_clases_anonimas;

/**
 *
 * @author Moren
 */
public class EVA2_12_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // POLIMOSRFISMO --> HACER QUE ALGO SE COMPORTE COMO OTRA COSA
        Prueba prueba = new Prueba(){
            @Override
            public void mostrarMensaje(){
                System.out.println("Hola Mundo Cruel!!");
            }
        };
        prueba.mostrarMensaje();
        // TODO code application logic here
    }
    
}
/*class MiClase implements Prueba{
    
}*/
interface Prueba{
    void mostrarMensaje();
}
