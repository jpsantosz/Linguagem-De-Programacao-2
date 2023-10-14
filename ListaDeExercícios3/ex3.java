package ListaDeExercícios3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // Obter o texto do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String textoUsuario = sc.nextLine();
        sc.close();

        // Chamar a função para contar caracteres e palavras
        contarCaracteresEPalavras(textoUsuario);
    }

    private static void contarCaracteresEPalavras(String texto) {
        // Contar o número total de caracteres
        int numeroCaracteres = texto.length();

        // Contar o número de palavras
        String[] palavras = texto.split("\\s+");
        int numeroPalavras = palavras.length;

        // Exibir resultados
        System.out.println("Número total de caracteres: " + numeroCaracteres);
        System.out.println("Número de palavras: " + numeroPalavras);
    }
}

