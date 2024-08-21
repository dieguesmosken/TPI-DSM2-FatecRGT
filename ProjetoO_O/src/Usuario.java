
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    //declarar atributos da classe usuario
    private String nome;
    private String email;
    private int idade;
    private String endereço;

    //construtor da classe usuario
    //inicialização dos valores dos atributos
    public Usuario() {
        this("","",0,"");
    }

    public Usuario(String nome, String email, int idade, String endereço) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.endereço = endereço;
    }
    // enclapsulamento dos atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    
    // metodos da classe usuario
    public void guardarDados(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do usuario: ");;
        setNome(leia.next());
        
        System.out.println("Digite o email do usuario");
        setEmail(leia.next());
        
        System.out.println("Digite a idade do usuario");
        setIdade(leia.nextInt());
        
        System.out.println("Digite o endereço do cliente");
        setEndereco(leia.next());
    }
    
    
    
}
