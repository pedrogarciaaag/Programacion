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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Introduzca la contraseña");
        String contraseña= scaner.nextLine();
        
        int contador = 0;
        
        while(contador<3){
           
           if(contraseña.equals("eureka")){
            System.out.println("La contrsaeña es correcta");
            contador = 4;
            }else{
               contador++;  
               
               if(contador<3){
               System.out.println("Vuelva a intentarlo");
               
               System.out.println("Introduzca la contraseña");
               contraseña= scaner.nextLine();
               }else {
                   System.out.println("Se han acabados los intentos");
               }
           }
        }
    }
}
    
