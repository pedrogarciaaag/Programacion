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
public class Ejercicio04 {
    public static void main (String[]args){
        Scanner scaner = new Scanner(System.in); 
        
        System.out.println("Introduzca los grados celsius");
        double grados = scaner.nextDouble();
        double darenhait = (grados*9/5)+32 ;
        
        System.out.println("Los grados en farenhait son " + darenhait );
        
    }
}
