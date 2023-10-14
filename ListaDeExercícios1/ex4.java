//Faça um programa que, enquanto o usuário desejar, leia números
//inteiros. Ao final, o programa deve exibir a quantidade de números pares e
//ímpares informados.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0;
        int impar = 0;

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        while (num > 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }
        }
        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de ímpares: " + impar);

        sc.close();
    }
}

