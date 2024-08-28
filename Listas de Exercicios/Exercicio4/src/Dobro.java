import java.util.Scanner;

public class Dobro {
    private double numero;
    private double calculo;

    public Dobro(){
        this(0, 0);

    }

    public Dobro(double numero, double calculo){
        this.numero = numero;
        this.calculo = calculo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public void calcularDobro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        this.numero = scanner.nextDouble();

        setCalculo(this.numero * 2);

        System.out.println("O dobro do número " + getNumero() + " é: " + getCalculo());
    }
}
