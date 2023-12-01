/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
import java.util.Scanner ;

/**
 *
 * @author alumne-DAM
 */
public class Ejercicio08 {
    public  static void main(String[]args){  
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que figura quieres calcular(triangulo,cuadrado o pentagono)? : ");
        String figura = scanner.nextLine();
        
        
        
        if (figura.equals("triangulo")){ 
            Scanner numero1 = new Scanner(System.in);
            System.out.println("Escriba la base");
            double base = numero1.nextDouble();
        
            Scanner numero2 = new Scanner (System.in);
            System.out.println("Escriba la altura");
            double altura = numero2.nextDouble();
            
            System.out.println("El area del triangulo es " + (base*altura)/2);
            
            
        }else if (figura.equals("cuadrado")){
            Scanner numero1 = new Scanner(System.in);
            System.out.println("Escriba un lado");
            double lado1 = numero1.nextDouble();
        
            Scanner numero2 = new Scanner (System.in);
            System.out.println("Escriba otro lado");
            double lado2 = numero2.nextDouble();
            
            System.out.println("El area del cuadrado es " + lado1*lado2);
               
        }else if (figura.equals("pentagono")){
            Scanner numero1 = new Scanner(System.in);
            System.out.println("Escriba el perimetro");
            double perimetro = numero1.nextDouble();
        
            Scanner numero2 = new Scanner (System.in);
            System.out.println("Escriba el apotema");
            double apotema = numero2.nextDouble();
            
            System.out.println("El area del pentagono es " + (perimetro*apotema)/2);
        
        }else{
            System.out.println("Lo siento, no puedo calcular el área de esa figura.");
        }      
    }
}
