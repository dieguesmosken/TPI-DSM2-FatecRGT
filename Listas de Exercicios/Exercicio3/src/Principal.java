public class Principal {
    public static void main(String[] args) throws Exception {
        
        Fornecedores fornecedor = new Fornecedores();

        fornecedor.cadastrarFornecedor();
        fornecedor.listarFornecedor();
    }
}
