/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstanteriaPractica;

/**
 *
 * @author alumne-DAM
 */
public class Llibre {
    private String titol;
    private String autor;
    private Integer qualificacio;
    
    public Llibre(String titol, String autor, Integer qualificacio){
        this.titol = titol;
        this.autor = autor;
        this.qualificacio = qualificacio;
    }
    public String getTitol(){
        return titol;
    }
    public String getAutor(){
        return autor;
    }
    public Integer getQualificacio(){
        return qualificacio;
    }
    public void setTitol(String nouTitol){
        titol = nouTitol;
    }
    public void setAutor(String nouAutor){
        autor = nouAutor;
    }
    public void setQualificacio(Integer novaQualificacio){
        qualificacio = novaQualificacio;
    }
    
    public void pintarLlibre(){
        System.out.println("El titol del llibre es : "+titol);
        System.out.println("L'autor del llibre es : "+autor);
        System.out.println("La qualifiacio del llibre es : "+qualificacio);
    }
    
}
