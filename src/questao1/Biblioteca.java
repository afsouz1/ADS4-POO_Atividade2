package questao1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
    Questão 1: Sistema de Biblioteca
    Crie um programa que gerencie um sistema de biblioteca. Implemente as
    seguintes classes:
        ➔ Classe Livro: Com atributos titulo, autor e anoPublicacao.
        ➔ Classe Biblioteca: Utilize um ArrayList para armazenar livros.

    Implemente métodos para:
        ◆ Adicionar livros.
        ◆ Exibir todos os livros.
        ◆ Buscar livros por autor.
        ◆ Buscar livros por ano de publicação
 */

public class Biblioteca {


    public void addLivro(Scanner in, ArrayList<Livro> arrayLivros){
        String varTitulo, varAutor;
        int varAno;
        
        System.out.print("Insira o TÍTULO do livro: ");
        varTitulo = in.nextLine();
        System.out.print("Insira o AUTOR do livro: ");
        varAutor = in.nextLine();
        System.out.print("Insira o ANO DE PUBLICAÇÃO do livro: ");
        varAno = in.nextInt();
        arrayLivros.add(new Livro(varTitulo, varAutor, varAno));      
    }

    public void seeLivro(ArrayList<Livro> arrayLivros, Iterator<Livro> iter){
        iter = arrayLivros.iterator();
        Livro temp;
        LimparTela.limparTela();

        System.out.println("\nLivros");
        while (iter.hasNext()) {
            temp = iter.next();
            System.out.println(temp.toString());
        }
    }

    public void buscarLivroAutor(Scanner in, ArrayList<Livro> arrayLivros, Iterator<Livro> iter){
        String varAutor;
        System.out.print("Insira o nome do autor: ");
        varAutor = in.nextLine();
        iter = arrayLivros.iterator();
        Livro temp;
        while (iter.hasNext()) {
            temp = iter.next();

            if (temp.getAutor().equalsIgnoreCase(varAutor)){
                System.out.println(temp.toString());
            }
        }
    }

    public void buscarLivroAno(Scanner in, ArrayList<Livro> arrayLivros, Iterator<Livro> iter){
        int varAnoPublicacao;
        System.out.print("Insira o ano de publicação: ");
        varAnoPublicacao = in.nextInt();
        iter = arrayLivros.iterator();
        Livro temp;
        while (iter.hasNext()) {
            temp = iter.next();

            if (temp.getAnoPublicacao() == varAnoPublicacao){
                System.out.println(temp.toString());
            }
        }  
    }

    public int mainMenu (Scanner in, int r){
        System.out.print("\nSelecione a função desejada:\n  (1)Adicionar Livro;\n  (2)Exibir todos os livros cadastrados;\n  (3)Buscar livros por Autor;\n  (4)Buscar livros por Ano de Publicação;\n  (0)Sair;\n  Opção:  ");
        r = in.nextInt();
        in.nextLine();
        return r;
    }
    
    
    public static void main(String[] args) throws Exception {
        ArrayList<Livro> arrayLivros = new ArrayList<>();
        Iterator<Livro> iter = arrayLivros.iterator();
        Biblioteca method = new Biblioteca();
        Scanner in = new Scanner(System.in);
        int opt = 0;
        boolean ct = true;

        do{
            opt = method.mainMenu(in, opt);
            switch (opt) {
                case 0:
                    LimparTela.limparTela();
                    System.out.println("Saindo...");
                    ct = false;
                    break;
                case 1:
                    LimparTela.limparTela();
                    method.addLivro(in, arrayLivros);
                    break;
                case 2:
                    LimparTela.limparTela();
                    method.seeLivro(arrayLivros, iter);
                    break;
                case 3:
                    LimparTela.limparTela();
                    method.buscarLivroAutor(in, arrayLivros, iter);
                    break;
                case 4:
                    LimparTela.limparTela();
                    method.buscarLivroAno(in, arrayLivros, iter);
                    break;
                default:
                    System.out.println("! Erro, refaça a operação.");
                    break;
            }
        }while(ct);
    }
}



