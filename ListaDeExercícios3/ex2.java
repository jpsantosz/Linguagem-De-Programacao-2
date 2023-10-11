//Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
//a) O número de caracteres da string.
//b) A string com todas suas letras em maiúsculo.
//c) O número de vogais da string.
//d) Se a string digitada começa com “A” (ignorando maiúsculas/minúsculas).
//e) Se a string digitada termina com “O” (ignorando maiúsculas/minúsculas).
//f) Se a string é um palíndromo ou não. 

package ListaDeExercícios3;

import java.util.Scanner;

public class ex2 {

    public static int numeroVogais(String entrada) {
        int count = 0;
        entrada = entrada.toLowerCase();
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean verificaA(String entrada) {
        entrada = entrada.toLowerCase();
        char c = entrada.charAt(0);
            
        if (c == 'a') {
            return true;
        }
        else {
            return false;
        }
    } 

    public static boolean verificaO(String entrada) {
        entrada = entrada.toLowerCase();
        char c = entrada.charAt(0);
            
        if (c == 'o') {
            return true;
        }
        else {
            return false;
        }
    } 

    private static boolean ehPalindromo(String entrada) {
        entrada = entrada.replaceAll("\\s+", "").toLowerCase();

        String reversa = new StringBuilder(entrada).reverse().toString();
        return entrada.equals(reversa);
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String entrada = sc.nextLine();

        System.out.println("Número de caracteres da string: " + entrada.length());
        System.out.println("String em maiúsculo: " + entrada.toUpperCase());
        System.out.println("Número de vogais: " + numeroVogais(entrada));
        System.out.println("Strinc começa com A: " + verificaA(entrada));
        System.out.println("Strinc começa com O: " + verificaO(entrada));

        if (ehPalindromo(entrada)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        sc.close();
    }
}
