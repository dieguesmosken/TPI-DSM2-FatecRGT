import java.util.Scanner;

public class Cliente {


    private String nome;
    private String end;
    private String rg;

    public Cliente() {
        this("","","");
    }


    public Cliente(String nome, String end, String rg) {
        this.nome = nome;
        this.end = end;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public void cadastrarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        this.nome = sc.nextLine();
        System.out.println("Digite o endereço do cliente: ");
        this.end = sc.nextLine();
        System.out.println("Digite o RG do cliente: ");
        this.rg = sc.nextLine();
    

    }

    public void listarCliente(){
        System.out.println("Nome: " + getNome() + "\nEndereço: " + getEnd() + "\nRG: " + getRg());
    }


}

