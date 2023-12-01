/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

/**
 *
 * @author alumne-DAM
 */
public class Array_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase ="Cristiano el GOAT";
        char [] array = frase.toCharArray();
        
        int palabra=0;
        while(palabra <array.length ){
            System.out.println(array[palabra]);
            palabra++;
        }
         
    }
    
}
