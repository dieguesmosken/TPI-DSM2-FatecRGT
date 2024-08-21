/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ package exercicio4;

import java.util.Scanner;

/**
 * * * @author fatec-dsm2
 */
public class Exercicio4 {

    /**
     * * @param args the command line arguments
     */
    public static void main(String[] args) { // TODO code application logic here double qtdsal,salm,salf; //QTDSAL = SALFUNC/SALMINIMO //biblioteca para leitura de dados

        Scanner leia = new Scanner(System.in);
        double salm, salf, qtdsal;
        System.out.println("Digite o Valor do salario minimo");
        salm = leia.nextDouble();
        System.out.println("Digite o salario do funcionario");
        salf = leia.nextDouble();
        qtdsal = salf / salm;
        System.out.println("o funcionario recebe :" + qtdsal + "salarios minimos"); 


//valor salario 1412; 
    
    } 
}
