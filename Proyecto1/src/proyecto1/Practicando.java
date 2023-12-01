/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;
import java.util.Random;
/**
 *
 * @author alumne-DAM
 */
public class Practicando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = calcular(10,15);
        System.out.println(num);
        
    }
    
    public static int calcular(int a, int b){
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(b - a + 1) + a;
        return num;
    }
}
