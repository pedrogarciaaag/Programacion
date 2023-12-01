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
public class Hundido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        boolean [] [] tablero = {
            {true,false,true,false,false},
            {false,true,true,false,false},
            {true,false,true,false,false},
            {true,false,true,true,false},
            {false,false,true,true,true}
        };
        int barcoshundidos = 0;
        int intentos = 0;
        
        System.out.println("¡Bienvenido al juego hundido!");
        System.out.println("Tendras cinco oportunidades para hundir el maximo de barcos que puedas");
        
        while(intentos<5){
            System.out.println("Introduzca la primera posicion: ");
            int x = scaner.nextInt();
            System.out.println("Introduzca la segunda posicion: ");
            int y = scaner.nextInt();
            if(tablero[x][y] == true){
                System.out.println("¡Has tocado un barco!");
                barcoshundidos++;
                intentos++;
                System.out.println("Intento: " + intentos);
                tablero[x][y]=false;
                
            }else{
                System.out.println("¡Agua!");
                intentos++;
                System.out.println("Intento: " + intentos);
            }    
        }
        System.out.println("--------------");
        System.out.println("Fin del juego.");
        System.out.println("Has hundido un total de " + barcoshundidos);
    }
}
