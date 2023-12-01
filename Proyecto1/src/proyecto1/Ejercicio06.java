/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
import java.util.Scanner ;

/**
 *
 * @author alumne-DAM
 */
public class Ejercicio06 {
    public static void main(String[] args){
        Scanner metros = new Scanner(System.in);
        System.out.println("Escriba la velocidad en Km/h : ");
            double metres = metros.nextDouble();
            
        System.out.println("La velocidad en m/s es " + (metres*1000)/3600);
      
    }
}
