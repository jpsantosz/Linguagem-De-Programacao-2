//Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja,
//na posição número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. Em seguida, exiba os valores deste vetor.

package ListaDeExercícios3.exercicio1;

public class ex1 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        // Preenchendo o vetor com os números de 101 a 150
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 101 + i;
        }

        // Exibindo os valores do vetor
        System.out.println("Valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
