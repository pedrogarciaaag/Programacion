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
public class Ejercicio03 {
    public static void main (String[] args){
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Introduzca un numero :");
        int num = scaner.nextInt();
       
        System.out.println("El doble de tu numero es " + num*num + "y el triple es " + num*num*num);
    }
}
