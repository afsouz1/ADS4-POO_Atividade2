package questao3;

public class Hospede {

    private String cpfHospede;
    private String enderecoHospede;
    private String telefoneHospede;

    public Hospede(String cpfHospede, String enderecoHospede, String telefoneHospede){
        this.cpfHospede = cpfHospede;
        this.enderecoHospede = enderecoHospede;
        this.telefoneHospede = telefoneHospede;
    }

    public String getCpfHospede() {
        return cpfHospede;
    }
    public String getEnderecoHospede() {
        return enderecoHospede;
    }
    public String getTelefoneHospede() {
        return telefoneHospede;
    }

    @Override
    public String toString() {
        return "Hospede [cpfHospede=" + cpfHospede + ", enderecoHospede=" + enderecoHospede + ", telefoneHospede="
                + telefoneHospede + "]";
    }

    
   
}
