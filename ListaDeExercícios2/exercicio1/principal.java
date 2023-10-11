//Crie um novo projeto que defina uma classe para representar um círculo. Dois atributos precisam ser definidos: raio, que é do tipo double e possui como valor default 1 e cor, que armazenada um valor do tipo String
//e tem como valor default “vermelho”. A classe deve implementar os métodos de acesso aos atributos (getters e setters), além de definir um método para calcular a área do círculo (2 ∗ 𝜋 ∗ r^2) e outro para exibir os
//dados do círculo. Em seguida, crie uma classe contendo o método main e instancie dois círculos. Altere a cor e o raio dos círculos, calcule a área e exiba seus dados.

package ListaDeExercícios2.exercicio1;

public class principal {
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();

        c1.setCor("roxo");
        c1.setRaio(2);

        c2.setCor("amarelo");
        c2.setRaio(5);

        System.out.println("Dados do círculo 1: ");
        c1.exibirDados();
        System.out.println("Dados do círculo 2: ");
        c2.exibirDados();
    }
}
