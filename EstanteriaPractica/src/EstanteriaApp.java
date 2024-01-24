/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstanteriaPractica;

/**
 *
 * @author alumne-DAM
 */
public class EstanteriaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estanteria estanteria = new Estanteria();
        
        Llibre L1 = new Llibre("Luna de Pluton","Dross",8);
        Llibre L2 = new Llibre("Los Secretos de Youtube","TheGrefg",6);
        
        estanteria.afegirLLibre(L1);
        estanteria.afegirLLibre(L2);
        
        Llibre L3 = new Llibre("Dragon Ball","Akira Toriyama",10);
        Llibre L4 = new Llibre("Jujutsu Kaisen","Gege Akutami",9);
        Llibre L5 = new Llibre("Don Quijote","Miguel de Cervantes",5);
        
        estanteria.afegirLLibre(L3);
        estanteria.afegirLLibre(L4);
        estanteria.afegirLLibre(L5);
        
        estanteria.Top10();
        
        estanteria.eliminarLlibre("", "Miguel de Cervantes");
        
        estanteria.mostrarEstanteria();
    }
    
}
