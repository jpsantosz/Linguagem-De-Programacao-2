package Atividade4;

public class Diretor {
    private String nome;
    private int anosExperiencia;
    private String origem;

    public Diretor() {

    }

    public Diretor(String nome, int anosExperiencia, String origem) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.origem = origem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Tempo de experiência: " + anosExperiencia + " anos");
        System.out.println("Local de origem: " + origem);
    }
}
