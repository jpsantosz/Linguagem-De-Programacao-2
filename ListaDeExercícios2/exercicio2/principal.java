//Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, nacionalidade, altura e peso. Crie os métodos de acesso aos atributos (setters e getters) e também um método para imprimir
//todos os dados do jogador. Além disso, defina um método para calcular o IMC do jogador. Em seguida, crie uma classe com o método main utilizando array de objetos para armazenar os dados de até 40 jogadores, de acordo
//com o desejo do usuário. Ao final, o programa deve exibir todos os dados dos jogadores, bem como o IMC de cada um deles.

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
