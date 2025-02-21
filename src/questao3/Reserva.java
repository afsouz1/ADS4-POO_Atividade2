package questao3;

public class Reserva {

    private Quarto quarto;
    private Hospede hospede;
    private int numeroDias;
    private String dataReserva;
    

    public Reserva (Quarto quarto, Hospede hospede, int numeroDias, String dataReserva){
        this.quarto = quarto;
        this.hospede = hospede;
        this.numeroDias = numeroDias;
        this.dataReserva = dataReserva;

    }
    

    public Quarto getQuarto() {
        return quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public String getDataReserva() {
        return dataReserva;
    }


    @Override
    public String toString() {
        return "Reserva [quarto=" + quarto + ", hospede=" + hospede + ", numeroDias=" + numeroDias + ", dataReserva="
                + dataReserva + "]";
    }

    
}
