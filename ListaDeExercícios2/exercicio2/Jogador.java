//Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, nacionalidade, altura e peso. Crie os métodos de acesso aos atributos (setters e getters) e também um método para imprimir
//todos os dados do jogador. Além disso, defina um método para calcular o IMC do jogador. Em seguida, crie uma classe com o método main utilizando array de objetos para armazenar os dados de até 40 jogadores, de acordo
//com o desejo do usuário. Ao final, o programa deve exibir todos os dados dos jogadores, bem como o IMC de cada um deles.

package ListaDeExercícios2.exercicio2;

public class Jogador {
    String nome;
    String posicao;
    String nacionalidade;
    double altura;
    double peso;
    
    public Jogador(String nome, String posicao, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularImc() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Nacionaliade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Imc: " + calcularImc());
    }
}
