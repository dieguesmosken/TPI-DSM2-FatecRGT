/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1,n2,n3,n4,n5,n6,m1,m2;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = leia.nextDouble();
        System.out.println("Digite a quarta nota: ");
        n4 = leia.nextDouble();
        System.out.println("Digite a quinta nota: ");
        n5 = leia.nextDouble();
        System.out.println("Digite a sexta nota: ");
        n6 = leia.nextDouble();
        
        m1 = (n1+n2+n3)/3;
        m2 = (n4+n5+n6)/3;
        
        System.out.println("a primeira media é: " + m1 +" a segunda media"+ m2);
        
        
        
        
    }
    
}
