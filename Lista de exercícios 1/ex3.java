//Faça um programa que leia 15 números inteiros e exiba na tela qual
//é o maior dos números lidos

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            if (num > first) {
                first = num;
            }
        }

        System.out.println("O maior número é: " + first);

        sc.close();
    }
}