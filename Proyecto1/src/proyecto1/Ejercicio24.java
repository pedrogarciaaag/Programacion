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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner (System.in);
        
        System.out.println("¿Quieres sumar, restar, multiplicar o dividir ?");
        String operacion = scaner.nextLine();
        
        if(operacion.equals("sumar")){
            System.out.println("Introduze dos numeros");
            double num1 = scaner.nextDouble();
            double num2 = scaner.nextDouble();
            System.out.println("La suma es " + (num1+num2));
        }
        else if(operacion.equals("resta")){
            System.out.println("Introduze dos numeros");
            double num1 = scaner.nextDouble();
            double num2 = scaner.nextDouble();
            System.out.println("La resta es " + (num1-num2));
        }
        else if(operacion.equals("multiplicar")){
            System.out.println("Introduze dos numeros");
            double num1 = scaner.nextDouble();
            double num2 = scaner.nextDouble();
            System.out.println("La multiplicacion es " + (num1*num2));
        }
        else if(operacion.equals("dividir")){
            System.out.println("Introduze dos numeros");
            double num1 = scaner.nextDouble();
            double num2 = scaner.nextDouble();
            System.out.println("La division es " + (num1/num2));
        }else{
            System.out.println("No entiendo");
        }
            
    }
    
}


