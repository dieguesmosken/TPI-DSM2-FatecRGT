/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int idadeY, idadeD;
        System.out.println("Digite a sua idade em anos");
        idadeY = leia.nextInt();
        idadeD = idadeY * 365;
        System.out.println("Sua idade em dias é: "+ idadeD);
    }
    
}
