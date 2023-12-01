/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumne-DAM
 */
public class JuegoNumero {

    public static void main(String[] args) {
        /*crear una aplciacion de encertar numero.
        Algorismo genere numero del 1 al 50
        Cada turno, nos pedira un numero y lo comparara con el numero aleatorio
        Nos tiene que decir si lo hemos acertado o no, o si es mayor o menor
        El programa acaba e el quinto intento*/
        Scanner scaner = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroSecreto = aleatorio.nextInt(51);
        int intentos = 0;
        boolean fin = false;

        System.out.println("Adivina el numero del 0 al 50 ");

        while (intentos < 5 && fin == false) {
            System.out.println("Escriba un numero : ");
            int numeroJugador = scaner.nextInt();

            if (numeroJugador == numeroSecreto) {
                System.out.println("Hemos ganado");
                System.out.println("Era el :" + numeroSecreto);
                fin = true;
            } else if (numeroJugador > numeroSecreto) {
                System.out.println("Numero mas pequeño");
            } else {
                System.out.println("Numero mas grande");
            }
            intentos++;

        }
        if (fin == false) {
            System.out.println("Has perdido el numero era :" + numeroSecreto);
        }
    }
}    
