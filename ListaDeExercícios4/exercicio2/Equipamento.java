package exercicio2;

public class Equipamento {
    private boolean ligado;
    private String nome;

    public Equipamento() {

    }

    public Equipamento(String nome) {
        this.ligado = false;
        this.nome = nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void liga() {
        this.ligado = true;
    }

    public void desliga() {
        this.ligado = false;
    }
}
