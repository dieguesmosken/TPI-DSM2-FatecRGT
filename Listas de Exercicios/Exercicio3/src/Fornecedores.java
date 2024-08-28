import java.util.Scanner;

public class Fornecedores {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedores() {
        this("", "", "");
    }

    public Fornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void cadastrarFornecedor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do fornecedor: ");
        this.nomeFornecedor = input.nextLine();
        System.out.println("Digite o nome do produto: ");
        this.nomeProduto = input.nextLine();
        System.out.println("Digite a descrição do produto: ");
        this.descricaoProduto = input.nextLine();

    }

    public void listarFornecedor() {
        System.out.println("Nome do fornecedor: " + getNomeFornecedor() + "\nNome do produto: " + getNomeProduto()
                + "\nDescrição do produto: " + getDescricaoProduto());

    }
}