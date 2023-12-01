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
public class Ejercicio11 {
    public static void main (String[]args){
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Introduzca un numero : ");
        int num = scaner.nextInt();
        
        if(num % 2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
}
