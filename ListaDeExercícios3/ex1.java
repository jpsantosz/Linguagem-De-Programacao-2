//Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja,
//na posição número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. Em seguida, exiba os valores deste vetor.

package ListaDeExercícios3;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int[] Numeros = new int[50];
        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = 101 + i;
        }
        System.out.println("Vetor: ");
        System.out.println(Arrays.toString(Numeros));
    }
}
