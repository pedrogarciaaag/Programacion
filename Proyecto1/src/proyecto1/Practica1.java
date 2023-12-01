/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;
import java.util.Scanner;
import java.util .Random;
/**
 *
 * @author Propietario
 */
public class Practica1  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Random aleatorio = new Random();

        String [] insultos = {
            "\u001B[31m¿Has dejado ya de usar pañales?\u001B[0m",
            "\u001B[31m¡No hay palabras para describir los asqueroso que eres!\u001B[0m",
            "\u001B[31m¡He hablado con simios más educados que tu!\u001B[0m",
            "\u001B[31m¡Eres como un dolor en la parte baja de las espalda!\u001B[0m",
        };
        String [] contestaciones ={
          "\u001B[34m¿Por qué¿?Acaso querias pedirte uno prestado?\u001B[0m",
          "\u001B[34mSí que las hay, solo que nunca las he aprendido\u001B[0m",
          "\u001B[34mMe alegra que asistieras a tu reunion familiar diaria\u001B[0m",
          "\u001B[34mYa te estan fastidiando otra vez las almorranas ¿Eh?\u001B[0m"     
        };
        
        System.out.println("-------------------------------------------------------------------------------------¡Bienvenidos a Monkey Island!------------------------------------------------------------------------------");
        System.out.println("En este juego, tendras que demostrar tu ingenio y tu habilidad para ofender a tu rival con frases ingeniosas y divertidas. Pero cuidado, no basta con insultar, tambien hay que saber responder.");
        System.out.println("Las reglas son sencillas : * El duelo se divide en varios asaltos y cada asalto en un insulto y una respuesta. Gana el jugador que consiga ser el vencedor de tres asaltos. *");
        System.out.println("¿Estas listo para enfrentarte a los piratas mas malhablados del Caribe? ¡Pues que empiece la batalla de insultos!");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                
        int rondas = 1;
        int rondasganadas = 0;
        int rondasperdidas = 0;
        boolean jugadorinicial= aleatorio.nextBoolean();
        
        while(rondasganadas<3 && rondasperdidas<3){
            if(jugadorinicial){
                System.out.println("Elije tu frase: ");
                System.out.println("1."+insultos[0]);
                System.out.println("2."+insultos[1]);
                System.out.println("3."+insultos[2]);
                System.out.println("4."+insultos[3]);

                int eleccion = scaner.nextInt();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");

                if(eleccion>=1 && eleccion<=4){
                    System.out.println("Ronda: "+rondas);
                    System.out.println("Jugador: "+insultos[eleccion-1]);
                    int numero = aleatorio.nextInt(contestaciones.length);
                    System.out.println("Pirata: "+contestaciones[numero]);
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    rondas++;
                    if(numero!=eleccion-1){
                        rondasganadas++;
                    }else{
                        rondasperdidas++;
                    }
                    jugadorinicial = !jugadorinicial; 
                }else{
                    System.out.println("Por favor, elige un número entre 1 y 4.");
                }
            }else{
                int numero = aleatorio.nextInt(insultos.length);
                System.out.println("Pirata: "+insultos[numero]);
                System.out.println("Elije tu frase: ");
                System.out.println("1."+contestaciones[0]);
                System.out.println("2."+contestaciones[1]);
                System.out.println("3."+contestaciones[2]);
                System.out.println("4."+contestaciones[3]);

                int eleccion = scaner.nextInt();
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                if(eleccion>=1 && eleccion<=4){
                    System.out.println("Ronda: "+rondas);
                    System.out.println("Pirata: "+insultos[numero]);
                    System.out.println("Jugador: "+contestaciones[eleccion-1]);
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if(numero!=eleccion-1){
                        rondasperdidas++;
                        
                    }else{
                        rondasganadas++;
                    }
                    jugadorinicial = !jugadorinicial;
                    rondas++;
                }else{
                    System.out.println("Por favor, elige un número entre 1 y 4.");
                }
            }
        }if(rondasganadas==3){
            System.out.println("\u001B[32mHAS GANADO\u001B[0m");
            System.out.println("Jugador: Rindete y dame tu tesoro!");
            System.out.println("Pirata: Por favor no me hagas daño");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }else{
            System.out.println("\u001B[33mHAS PERDIDO\u001B[0m");
            System.out.println("Pirata: Ja!No eres rival para mi");
            System.out.println("Jugador: Me rindo! Me rindo!");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }        
}
   