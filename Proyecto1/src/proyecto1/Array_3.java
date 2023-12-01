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
public class Array_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = scaner.nextLine();
        char [] array = frase.toCharArray();
        
        boolean resultado=true;
        int principio = 0;
        int fin = array.length-1;
        
        while(principio<fin){
            if(array[principio]!= array[fin]){
                resultado=false;
            }
                principio++;
                fin--;
                
        }System.out.println(resultado);      
    }
    
}
