/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

/**
 *
 * @author alumne-DAM
 */
public class Array_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numeros_x2 = new int[numeros.length];

        int i = 0;
        while (i < numeros.length) {
            numeros_x2[i] = numeros[i] * 2;
            i++;
        }

        i = 0;
        while (i < numeros_x2.length) {
            System.out.println(numeros_x2[i]);
            i++;
        }
    }
    
}
