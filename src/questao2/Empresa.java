package questao2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/*
*Crie um programa para gerenciar funcionários de uma empresa. Implemente
*as seguintes classes:
*    ➔ Classe Funcionario: Com atributos nome, cargo e salario.
*    ➔ Classe Empresa: Utilize um ArrayList para armazenar os funcionários.
*
*Implemente métodos para:
*    ◆ Adicionar funcionários.
*    ◆ Exibir todos os funcionários.
*    ◆ Calcular a média salarial da empresa.
*    ◆ Buscar funcionários por cargo específico.
*/

public class Empresa {

    public void addFunc(Scanner in, ArrayList<Funcionario> arrayFunc){
        String varNome, varCargo;
        double varSalario;

        System.out.print("\nInsira o NOME do funcionário:  ");
        varNome = in.nextLine();
        System.out.print("Insira o CARGO do funcionário: ");
        varCargo = in.nextLine();
        System.out.print("Insira o SALÁRIO do funcionário: ");
        varSalario = in.nextDouble();

        arrayFunc.add(new Funcionario(varNome, varCargo, varSalario));
    }

    public void seeFunc(ArrayList<Funcionario>arrayFunc, Iterator<Funcionario> iter){
        iter = arrayFunc.iterator();
        Funcionario temp;
        System.out.println("Funcionários:");
        while (iter.hasNext()) {
            temp = iter.next();
            System.out.println(temp.toString());
        }
    }

    public void calcSalario(ArrayList<Funcionario>arrayFunc, Iterator<Funcionario> iter){
        iter = arrayFunc.iterator();
        Funcionario temp;
        int cont = 0;
        double media = 0, soma = 0;
        System.out.print("\nMédia salarial: R$");
        while (iter.hasNext()) {
            temp = iter.next();
            soma = soma + temp.getSalario();
            cont++;
        }

        media = soma/cont;

        System.out.println(media);
    }

    public void searchFunc(Scanner in, ArrayList<Funcionario> arrayFunc, Iterator<Funcionario> iter){
        iter = arrayFunc.iterator();
        String varCargo;
        System.out.print("Insira o nome do cargo: ");
        varCargo = in.nextLine();
        iter = arrayFunc.iterator();
        Funcionario temp;
        while (iter.hasNext()) {
            temp = iter.next();

            if (temp.getCargo().equalsIgnoreCase(varCargo)){
                System.out.println(temp.toString());
            }
        }
    }

    public int mainMenu(Scanner in, int opt){
        System.out.print("\nSelecione a opção desejada:\n1-Adicionar Funcionário;\n2-Exibir todos os funcionários cadastrados;\n3-Calcular média salarial;\n4-Buscar funcionários por cargo;\n0-Sair;\nOpção:  ");
        opt = in.nextInt();
        in.nextLine();
        return opt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Funcionario> arrayFunc = new ArrayList<>();
        Iterator<Funcionario> iter = arrayFunc.iterator();
        Empresa method = new Empresa();
        boolean ct = true;
        int opt = 0;
        do{
            opt = method.mainMenu(in, opt);
            ct = true;
            switch (opt) {
                case 1:
                    LimparTela.limparTela();
                    method.addFunc(in,arrayFunc);                
                    break;
                case 2:
                    LimparTela.limparTela();
                    method.seeFunc(arrayFunc, iter);
                    break;
                case 3:
                    LimparTela.limparTela();
                    method.calcSalario(arrayFunc, iter);
                    break;
                case 4:
                    LimparTela.limparTela();
                    method.searchFunc(in, arrayFunc, iter);
                    break;
                case 0:
                    LimparTela.limparTela();
                    System.out.println("\nSaindo...\n");
                    ct = false;
                    break;   
                default:
                    LimparTela.limparTela();
                    System.out.println("Erro, insira uma opção válida.");
                    ct = false;
                    break;
            }
        }while (ct);
    }    
}
