package questao3;

public class Quarto {

    private int numeroQuarto;
    private double valorDiaria;

    public Quarto(int numerQuarto, double valorDiaria){
        this.numeroQuarto = numerQuarto;
        this.valorDiaria = valorDiaria;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public String toString() {
        return "Quarto [numeroQuarto=" + numeroQuarto + ", valorDiaria=" + valorDiaria + "]";
    }
    
    
}
