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
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Quieres sumar, restar, multiplicar o dividir");
        String operacion = scaner.nextLine();
        
        switch(operacion){
            case "sumar":
                    System.out.println("Introduzca dos numeros");
                    double num1 = scaner.nextDouble();
                    double num2 = scaner.nextDouble();
                    System.out.println("La suma es " + (num1+num2));
                    break;
                    
            case "restar":
                System.out.println("Introduzca dos numeros");
                    double num3 = scaner.nextDouble();
                    double num4 = scaner.nextDouble();
                    System.out.println("La resta es " + (num3-num4));
                    break;
        }
        
        
    }
    
}
