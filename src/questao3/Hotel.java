package questao3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Hotel {

    public void addReserva(Scanner in, ArrayList<Reserva> arrayReserva){

    }

    public void cancelReserva(){

    }

    public void searchReserva() {

    }

    public void calcReceita(){

    }

    public void listReserva(){

    }

    public int mainMenu(int opt, Scanner in){
        System.out.print("\nInsira a opção desejada:\n1-Criar Reserva;\n2-Cancelar Reserva;\n3-Buscar Reserva realizada;\n4-Calcular Receita Total;\n5-Listar todas as reservas ativas;\n0-Sair do Sistema;\nOpção:   ");
        opt = in.nextInt();
        in.nextLine();
        return opt;
    }
    
    public static void main(String[] args) {
        Hotel method = new Hotel();
        Scanner in = new Scanner(System.in);
        ArrayList<Reserva> arrayReserva = new ArrayList<>();
        ArrayList<Quarto> arrayQuarto = new ArrayList<>();
        Iterator<Reserva> iterReserva = arrayReserva.iterator();
        Iterator<Quarto> iterQuarto = arrayQuarto.iterator();
        int opt = 0;
        boolean ct = true;

        do{
            method.mainMenu(opt,in);
            switch (opt) {
                case 1:
                    LimparTela.limparTela();
                    method.addReserva(in,arrayReserva);
                    break;
                case 2:
                    LimparTela.limparTela();
                    method.cancelReserva();
                    break;
                case 3:
                    LimparTela.limparTela();
                    method.searchReserva();
                    break;
                case 4:
                    LimparTela.limparTela();
                    method.calcReceita();
                    break;
                case 5:
                    LimparTela.limparTela();
                    method.listReserva();
                    break;
                case 0:
                    LimparTela.limparTela();
                    System.out.println("\nSaindo do sistema...\n");
                    ct = false;
                    break;
            
                default:
                    System.out.println("\nErro: Insira uma opção válida;\n");
                    break;
            }
        }while(ct);
    }
}
