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
public class Ejercicio12 {
    public static void main (String[]args){
        Scanner scaner = new Scanner (System.in);
           
        System.out.println("Introduzca un caracter");
        char caracter = scaner.next().charAt(0);
        
        if (Character.isUpperCase(caracter)){
            System.out.println("Es mayuscula");
        }
        else{
            System.out.println("Es minuscula");
        }
    }
}
