/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int numero1, numero2, soma;;
        numero1 = 50;
        numero2 = 70;
        soma = numero1 + numero2;
        System.out.println("O valor da soma é " + soma);*/
        
        int n1, n2, soma;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo número");
        n2 = leia.nextInt();
        soma = n1 + n2;
        System.out.println("O valor da soma é " + soma);
                
        
        
    }
   
}
