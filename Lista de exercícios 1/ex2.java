//Faça um programa que leia 10 números inteiros e calcule a média desses números.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            soma += num;
        }
        double media = soma/5.0;
        System.out.println("A média é: " + media);

        sc.close();
    }
}