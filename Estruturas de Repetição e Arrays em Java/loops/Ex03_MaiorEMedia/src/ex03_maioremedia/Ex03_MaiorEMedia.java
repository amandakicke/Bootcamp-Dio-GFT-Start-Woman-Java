
package ex03_maioremedia;

import java.util.Scanner;

public class Ex03_MaiorEMedia {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
                
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            
            soma = soma + numero;
            
            
            if (numero > maior) maior = numero;
            
            count = count + 1;
            
        } while(count < 5);
        
        System.out.println("Maior número: " + maior);
        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("E a média deles é: " + soma / 5);
    }
    
    
}
