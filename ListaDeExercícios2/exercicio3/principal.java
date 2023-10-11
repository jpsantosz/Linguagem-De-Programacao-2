//Crie um novo projeto que defina uma classe para representar um triângulo. Três atributos precisam ser definidos: l1, l2 e l3. Cada atributo representa um dos lados do triângulo, do tipo inteiro. 
//A classe deve implementar construtores (padrão e completo), os métodos de acesso aos atributos (getters e setters), além de definir um método para informar o
//tipo do triângulo (equilátero, isósceles ou escaleno) e outro para exibir os dados do triângulo. Em seguida, crie uma classe contendo o método main e instancie dois triângulos. 
//Exiba os dados de cada triângulo, bem como o seu tipo.

package ListaDeExercícios2.exercicio3;

public class principal {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2,2,4);
        Triangulo t2 = new Triangulo(4,5,6);

        System.out.println("Dados do triângulo 1: ");
        t1.exibirDados();
        System.out.println("Dados do triângulo 2: ");
        t2.exibirDados();
    }
}
