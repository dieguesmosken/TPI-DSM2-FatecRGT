/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio5 {

    /**
     * * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        double salario = 1000;
        double percentual = 10;
        double novosalario;
        novosalario = salario + (salario * percentual) / 100;
        System.out.println("O novo salário é: " + novosalario);
    }
}

