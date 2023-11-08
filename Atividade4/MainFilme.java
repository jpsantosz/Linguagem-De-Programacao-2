package Atividade4;

import java.util.Scanner;
import java.util.ArrayList;

public class MainFilme {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Cadastro de Filme:");
            System.out.print("Título do Filme: ");
            String titulo = sc.nextLine();
            System.out.print("Descrição do Filme: ");
            String descricao = sc.nextLine();
            System.out.print("Nome do Diretor: ");
            String nomeDiretor = sc.nextLine();
            System.out.print("Tempo de Experiência do Diretor (anos): ");
            int tempoExperiencia = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Local de Origem do Diretor: ");
            String localOrigem = sc.nextLine();
            System.out.print("Duração do Filme em Minutos: ");
            int duracaoEmMinutos = sc.nextInt();
            sc.nextLine(); 

            Diretor diretor = new Diretor(nomeDiretor, tempoExperiencia, localOrigem);
            Filme filme = new Filme(titulo, descricao, diretor, duracaoEmMinutos);
            filmes.add(filme);

            System.out.print("Deseja cadastrar outro filme? (S/N): ");
            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        System.out.print("Digite o título do filme a ser buscado: ");
        String tituloBusca = sc.nextLine();

        for (Filme filme : filmes) {
            if (filme.compararTitulo(tituloBusca)) {
                filme.exibirDados();
            }
        }
        sc.close();
    }
}
