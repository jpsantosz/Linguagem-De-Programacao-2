package ListaDeExercícios2.exercicio2;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[40];

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("Digite os dados para o jogador " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Posição: ");
            String posicao = sc.nextLine();
            System.out.print("Nacionalidade: ");
            String nacionalidade = sc.nextLine();
            System.out.print("Altura (em metros): ");
            double altura = sc.nextDouble();
            System.out.print("Peso (em kg): ");
            double peso = sc.nextDouble();

            jogadores[i] = new Jogador(nome, posicao, nacionalidade, altura, peso);
            sc.nextLine(); 
        }

        System.out.println("\nDados dos Jogadores:");
        for (Jogador jogador : jogadores) {
            if (jogador != null) {
                jogador.exibirDados();
            }
        }

        sc.close();
    }
}
