/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstanteriaPractica;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author alumne-DAM
 */
public class Estanteria {
    
    private static List <Llibre> coleccioLlibres;
    
    public Estanteria(){
        coleccioLlibres = new ArrayList<>();
}
    public void afegirLLibre(Llibre llibre){
    if(coleccioLlibres.size()<10 ){
        coleccioLlibres.add(llibre);
        System.out.println("--------------------");
        System.out.println("S'ha afegit el llibre correctament");
        System.out.println("--------------------");
        if(coleccioLlibres.contains(llibre)){
            System.out.println("--------------------");
            System.out.println("Aquest llibre ya se ha afegit anteriorment");
            System.out.println("--------------------");
        }   
    }else{
        System.out.println("--------------------");
        System.out.println("No hi ha espai suficient (elimina un llibre si vols mes espai)");
        System.out.println("--------------------");
        }
    }
    public void eliminarLlibre(String titol,String autor){
        coleccioLlibres.removeIf(llibre -> llibre.getTitol().equals(titol)|| llibre.getAutor().equals(autor));
        
        System.out.println("--------------------");
        System.out.println("Llibre eliminat correctament");
        System.out.println("--------------------");
    }
public void Top10(){
    List<Llibre> llibresOrdenats = new ArrayList<>(coleccioLlibres);
    Collections.sort(llibresOrdenats, Comparator.comparingInt(Llibre::getQualificacio).reversed());

    System.out.println("Top 10 Llibres:");
    System.out.println("--------------------");
    for(int i = 0; i < 10 && i < llibresOrdenats.size(); i++){
        llibresOrdenats.get(i).pintarLlibre();
        System.out.println("--------------------");
    }
}

    public void mostrarEstanteria(){
        System.out.println("Estanteria:");
        System.out.println("--------------------");
        for(Llibre llibre : coleccioLlibres){
            llibre.pintarLlibre();
            System.out.println("--------------------");
        }
    }
    
}
