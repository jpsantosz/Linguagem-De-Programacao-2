package Atividade5;

import java.util.Scanner;

public class DemoFormas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Digite 'R' para retângulo, 'C' para círculo e 'Q' para quadrado: ");
            String escolha = sc.nextLine();

            switch (escolha) {
                case "R":
                    System.out.println("Digite o lado do retângulo: ");
                    float ladoR = sc.nextFloat();
                    System.out.println("Digite a altura do retângulo: ");
                    float alturaR = sc.nextFloat();
                    sc.nextLine();
                    Retangulo retangulo = new Retangulo(ladoR, alturaR);
                    retangulo.exibirdDados();
                    break;
                    
                case "C":
                    System.out.println("Digite o raio do círculo: ");
                    float raio = sc.nextFloat();
                    sc.nextLine();
                    Circulo circulo = new Circulo(raio);
                    circulo.exibirdDados();    
                    break;

                case "Q":
                    System.out.println("Digite o lado do quadrado: ");
                    float ladoQ =  sc.nextFloat();
                    sc.nextLine();
                    Quadrado quadrado = new Quadrado(ladoQ);
                    quadrado.exibirDados();
                    break;
            
                default:
                    System.out.println("Escolhe inválida!");
                    break;
            }

            System.out.println("Deseja continuar? ('sim' para Sim, qualquer outra tecla para Não): ");
            continuar = sc.nextLine();

        } while (continuar.equals("sim"));

        sc.close();
    }
}
