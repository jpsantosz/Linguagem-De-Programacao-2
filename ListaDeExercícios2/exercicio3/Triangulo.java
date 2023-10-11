//Crie um novo projeto que defina uma classe para representar um triângulo. Três atributos precisam ser definidos: l1, l2 e l3. Cada atributo representa um dos lados do triângulo, do tipo inteiro. 
//A classe deve implementar construtores (padrão e completo), os métodos de acesso aos atributos (getters e setters), além de definir um método para informar o
//tipo do triângulo (equilátero, isósceles ou escaleno) e outro para exibir os dados do triângulo. Em seguida, crie uma classe contendo o método main e instancie dois triângulos. 
//Exiba os dados de cada triângulo, bem como o seu tipo.

package ListaDeExercícios2.exercicio3;

public class Triangulo {
    int lado1;
    int lado2;
    int lado3;

    public Triangulo() {

    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    public String tipoTriangulo() {
        if (lado1 == lado2 && lado1 == lado3) {
            String tipo = "equilátero";
            return tipo;
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3 ) {
            String tipo = "isósceles";
            return tipo;
        }
        else {
            String tipo = "escaleno";
            return tipo;
        }
    }
    public void exibirDados() {
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Tipo do triângulo: " + tipoTriangulo());
    }
    
}
