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
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Introduzca un dia de la semana");
        String dia = scaner.nextLine();
        
        switch(dia){
            case "Lunes":
                System.out.println("El dia es laboral");
                break;
            case "Martes":
                System.out.println("El dia es laboral");
                break;
            case "Miercoles":
                System.out.println("El dia es laboral");
                break;
            case "Jueves":
                System.out.println("El dia es laboral");
                break;
            case "Viernes":
                System.out.println("El dia es laboral");
                break;
            case "Sabado":
                System.out.println("El dia es festivo");
                break;
            case "Domingo":
                System.out.println("El dia es festivo");
                break;
            default:
                System.out.println("No has introduzido ningun dia");
                
        }
    
        
    }
    
}
