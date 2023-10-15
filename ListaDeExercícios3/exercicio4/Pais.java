package ListaDeExercícios3.exercicio4;

//declarando as variáveis do objeto País
public class Pais {
    private String sigla;
    private String nome;
    private int populacao;
    private double dimensao;

    //construtor default
    public Pais() {

    }

    //construtor normal
    public Pais(String sigla, String nome, int populacao, double dimensao) {
        this.sigla = sigla;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    //getters e setters
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    //método para calcular a densidade populacional
    public double calcularDensidade() {
        double den = this.populacao/this.dimensao;
        return den;
    }

    //método para imprimir os dados do país
    public void exibirDados() {
        System.out.println("Sigla: " + this.sigla);
        System.out.println("Nome: " + this.nome);
        System.out.println("População: " + this.populacao);
        System.out.println("Dimensão: " + this.dimensao);
        System.out.println("Densidade: " + calcularDensidade());
    }
}
