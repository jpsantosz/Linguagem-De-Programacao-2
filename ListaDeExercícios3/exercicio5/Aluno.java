package ListaDeExercícios3.exercicio5;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno() {

    }
    public Aluno(int matricula, String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
        this.media = calcularMedia();
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
        this.media = calcularMedia();
    }
    public double getMedia() {
        return media;
    }
    public double calcularMedia() {
        return (nota1 + nota2)/2;
    }

    public boolean compararNomes(String n) {
        if (nome.equalsIgnoreCase(n))
            return true;
        else
            return false;
        }
        
    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota1: " + nota2);
        System.out.println("Nota2: " + nota1);
        System.out.println("Media: " + media);
    }
}
