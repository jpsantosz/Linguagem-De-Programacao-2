//Crie um novo projeto que defina uma classe para representar um círculo. Dois atributos precisam ser definidos: raio, que é do tipo double e possui como valor default 1 e cor, que armazenada um valor do tipo String
//e tem como valor default “vermelho”. A classe deve implementar os métodos de acesso aos atributos (getters e setters), além de definir um método para calcular a área do círculo (2 ∗ 𝜋 ∗ r^2) e outro para exibir os
//dados do círculo. Em seguida, crie uma classe contendo o método main e instancie dois círculos. Altere a cor e o raio dos círculos, calcule a área e exiba seus dados.

package ListaDeExercícios2.exercicio1;

public class Circulo {
    public double raio;
    public String cor;

    public Circulo() {

    }

    public Circulo(double raio, String cor) {
        this.raio = 1;
        this.cor = "vermelho";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calcularArea() {
        double area = 2 * Math.PI * raio * raio;
        return area;
    }

    public void exibirDados() {
        System.out.println("Raio: " + raio);
        System.out.println("Cor: " + cor);
        System.out.println("Área: " + calcularArea());
    }
}
