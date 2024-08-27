/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Contatos {
    //declarar atributos
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public Contatos() {
        this("","","","");
    }

    public Contatos(String nome, String telefone, String endereco, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void cadastrarDados(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = entrada.nextLine();
        System.out.println("Digite o telefone: ");
        this.telefone = entrada.nextLine();
        System.out.println("Digite o endereco: ");
        this.endereco = entrada.nextLine();
        System.out.println("Digite a cidade: ");
        this.cidade = entrada.nextLine();
    
    }
    public void mostrarDados(){
        System.out.println("Nome: "+ getNome() + "\nTelefone: "+ getTelefone() + "\nCidade: "+ getCidade() + "\nEndereco: "+ getEndereco());

    }

    

    
    
    
}
