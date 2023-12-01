/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class Ejercicio05 {
   public static void main(String[] args){
    Scanner scaner = new Scanner(System.in);
    System.out.print("Escriba el radio de la circunferencia : ");
        double radi = scaner.nextDouble();
        
       System.out.println("La longitud es " + 2*Math.PI*radi);
       System.out.println("El area es " + Math.PI*(radi*radi));
        
    }
}

