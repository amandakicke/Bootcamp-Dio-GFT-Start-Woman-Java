
package ex05_tabuada;

import java.util.Scanner;

public class Ex05_Tabuada {

    public static void main(String[] args) {
        
    //GERADOR DE TABUADA

        Scanner scan = new Scanner(System.in);

        System.out.println("TABUADA");
        System.out.println("Escolha um número: ");
        int tabuada = scan.nextInt();

            System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

    
    }
    
}
