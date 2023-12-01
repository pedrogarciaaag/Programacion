/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

/**
 *
 * @author alumne-DAM
 */
public class Array_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int valor = 1;
        int i = 0;

        while (i < 3) {
            int j = 0;
            while (j < 3) {
                matriz[i][j] = valor;
                valor++;
                j++;
            }
            i++;
        }

        // Imprimir la matriz
        i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 3) {
                System.out.print(matriz[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
    

