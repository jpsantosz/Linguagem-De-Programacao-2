package ListaDeExercícios3.exercicio4;

import java.util.Scanner;


public class mainPaises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos países deseja cadastrar?");
        int numPaises = scanner.nextInt();

        Pais[] paises = new Pais[numPaises];

        for (int i = 0; i < numPaises; i++) {
            System.out.println("Cadastrando país " + (i + 1));
            paises[i] = cadastrarNovoPais(scanner);
        }

        System.out.println("\nLista de Países Cadastrados:");
        for (Pais pais : paises) {
            pais.exibirDados();
            System.out.println("-----------------------------");
        }

        scanner.close();
    }

    private static Pais cadastrarNovoPais(Scanner scanner) {
        System.out.println("Informe a sigla do país: ");
        String sigla = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Informe o nome do país: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a população do país: ");
        int populacao = scanner.nextInt();

        System.out.println("Informe a dimensão em km² do país: ");
        double dimensao = scanner.nextDouble();

        return new Pais(sigla, nome, populacao, dimensao);
    }
}

