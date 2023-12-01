/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author alumne-DAM
 */
public class Array_4 {
    
    public static void main(String[] args){
        //todo el codigo mamabicho
        int[] arrayEnters = {10, 20, 30, 40, 50, 60 ,70};
        int resultat = 0;
        int index = 0;
        while (index < arrayEnters.length){
            resultat = resultat + arrayEnters[0];
            index++;
        }
        
        
        for(int i=0; i < arrayEnters.length;i++){
            if("10".equals(arrayEnters[i])) {
                resultat= resultat + 1 ;
            }
        }
        
        int posicio1 = arrayEnters[1];
        int posicio2 = arrayEnters[2];
        int posicio3 = arrayEnters[3];
                System.out.println("Suma : " + (posicio3+posicio1+posicio2));
    }
    
}
    

