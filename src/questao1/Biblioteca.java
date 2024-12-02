package questao1;

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


    public void addLivro(){

    }

    public void seeLivro(){

    }

    public void buscarLivroAutor(){

    }

    public void buscarLivroAno(){

    }

    public int mainMenu (Scanner in, Livro volume, int r){
        System.out.print("--Selecione a função desejada:\n---(1)Adicionar Livro;\n---(2)Exibir todos os livros cadastrados;\n---(3)Buscar livros por Autor;\n---(4)Buscar livros por Ano de Publicação;\n---(0)Sair;\n>>>Opção:  ");
        r = in.nextInt();
        return r;
    }
    
    
    public static void main(String[] args) throws Exception {
        Biblioteca method = new Biblioteca();
        Livro volume = new Livro();
        Scanner in = new Scanner(System.in);
        int opt = 0;
        boolean ct = true;

        do{
            opt = method.mainMenu(in, volume, opt);
            switch (opt) {
                case 0:
                    System.out.println("---Saindo...");
                    ct = false;
                case 1:
                    method.addLivro();
                    ct = false;
                    break;
                case 2:
                    method.seeLivro();
                    ct = false;
                    break;
                case 3:
                    method.buscarLivroAutor();
                    ct = false;
                    break;
                case 4:
                    method.buscarLivroAno();
                    ct = false;
                    break;
                default:
                    System.out.println("!!!Erro, refaça a operação.");
                    break;
            }


        }while(ct);




        
        
    }
}



