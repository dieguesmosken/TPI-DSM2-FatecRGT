import java.util.Scanner;

public class Passagem {
    private String nomePassageiro;
    private String telefone;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numpoltrona;

    public Passagem() {
        this("", "", "", "", "", "", "");
    }

    public Passagem(String nomePassageiro, String telefone, String RG, String localViagem, String data, String horario, String numpoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numpoltrona = numpoltrona;
    }
    public String getNomePassageiro() {
        return nomePassageiro;
    }
    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String rG) {
        RG = rG;
    }
    public String getLocalViagem() {
        return localViagem;
    }
    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getNumpoltrona() {
        return numpoltrona;
    }
    public void setNumpoltrona(String numpoltrona) {
        this.numpoltrona = numpoltrona;
    }

    public void cadastrarDadosPassageiros(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do passageiro: ");
        nomePassageiro = entrada.nextLine();
        System.out.println("Digite o telefone do passageiro: ");
        telefone = entrada.nextLine();
        System.out.println("Digite o RG do passageiro: ");
        RG = entrada.nextLine();
        

    }

    public void cadastrarDadosPassagem(){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o nome do passageiro: ");
        nomePassageiro = ent.nextLine();
        System.out.println("Digite o local da viagem: ");
        localViagem = ent.nextLine();
        System.out.println("Digite a data da viagem (dd/mm/aaaa): ");
        data = ent.nextLine();
        System.out.println("Digite o horario da viagem (hh:mm): ");
        horario = ent.nextLine();
        System.out.println("Digite o numero da poltrona: ");
        numpoltrona = ent.nextLine();

    }

    public void mostrarDadosPassageiro(){
        System.out.println("\nNome do passageiro: " + getNomePassageiro() + "\nTelefone: " + getTelefone() + "\nRG: " + getRG());
    }

    public void mostrarDadosPassagem(){
        System.out.println("\nNome do passageiro: " + getNomePassageiro() + "\nLocal da viagem: " + getLocalViagem() + "\nData da viagem: " + getData() + "\nHorario da viagem: " + getHorario() + "\nNumero da poltrona: " + getNumpoltrona());
    }
    

    
}
