
package ex01_ordeminversa;

import java.util.Scanner;

public class Ex01_OrdemInversa {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        int[] vetor = {-3, -5, 15, 56, 8, 4};   
        
        
        System.out.println("Vetor: ");
        int count = 0;
        while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("\n Vetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }    
    
}
