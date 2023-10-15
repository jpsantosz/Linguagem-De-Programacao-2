//Faça um programa que, enquanto o usuário desejar, leia números
//inteiros. Ao final, o programa deve exibir a quantidade de números pares e
//ímpares informados.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0;
        int impar = 0;

        int num;

        do {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if (num > 0) {  // Adicionado para evitar contar o último número digitado duas vezes
                if (num % 2 == 0) {
                    par++;
                } 
                else {
                    impar++;
                }
            }
        } while (num > 0);

        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de ímpares: " + impar);

        sc.close();
    }
}