/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;
import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class Ejercicio_restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Introduzca el coste del plato (0 para terminar la sequencia): ");
        double dinero = scaner.nextDouble();
        double suma = 0;
        
        while(dinero !=0){
            System.out.println("Introduzca el coste del plato (0 para terminar la sequencia): ");
            dinero = scaner.nextDouble();
            suma = suma+dinero;
        }
        System.out.println("La suma total del plato es " + suma);
        
    }
    
}
