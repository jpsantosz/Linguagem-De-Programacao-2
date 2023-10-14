package ListaDeExercícios3;

import java.util.Scanner;

public class mainTurma {
    public static void menu() {
        System.out.println("\n***CADASTRO DE ALUNOS***\n");
        System.out.println("1- Cadastro");
        System.out.println("2- Buscar aluno");
        System.out.println("3- Exibir dados");
        System.out.println("4- Calcular a média da turma");
        System.out.println("5- Sair");
        System.out.println("\nInforme sua opção:");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[50];
        int opcao;
        int quantidade = 0;

        do {
            menu();
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha pendente

            switch (opcao) {
                case 1: {
                    if (quantidade < 50) {
                        alunos[quantidade] = new Aluno();
                        System.out.println("Matrícula: ");
                        alunos[quantidade].setMatricula(sc.nextInt());
                        sc.nextLine(); // Consumir quebra de linha pendente
                        System.out.println("Nome: ");
                        alunos[quantidade].setNome(sc.nextLine());
                        System.out.println("Nota 1: ");
                        alunos[quantidade].setNota1(sc.nextDouble());
                        System.out.println("Nota 2: ");
                        alunos[quantidade].setNota2(sc.nextDouble());
                        quantidade++;
                    } else {
                        System.out.println("Limite de alunos atingido!");
                    }
                    break;
                }
                case 2: {
                    if (quantidade > 0) {
                        String nome;
                        boolean achou = false;
                        System.out.println("Informe o nome a ser buscado: ");
                        nome = sc.nextLine();
                        for (int i = 0; i < quantidade; i++) {
                            if (alunos[i].getNome().equals(nome)) {
                                System.out.println("Aluno encontrado!");
                                achou = true;
                                break;
                            }
                        }
                        if (!achou) {
                            System.out.println("Aluno não encontrado!");
                        }
                    } else {
                        System.out.println("Não há alunos cadastrados!");
                    }
                    break;
                }
                case 3: {
                    if (quantidade > 0) {
                        System.out.println("\nALUNOS\n");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println(alunos[i]);
                        }
                    } else {
                        System.out.println("Não existem alunos!");
                    }
                    break;
                }
                case 4: {
                    double somaMedias = 0;
                    if (quantidade > 0) {
                        for (int i = 0; i < quantidade; i++) {
                            somaMedias += alunos[i].getMedia();
                        }
                        double mediaTurma = somaMedias / quantidade;
                        System.out.println("Média da turma: " + mediaTurma);
                    }
                    else {
                        System.out.println("Não há dados.");
                    }
                }
                case 5: {
                    System.out.println("\nFinalizando...\n");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 5);

        sc.close();
    }
}