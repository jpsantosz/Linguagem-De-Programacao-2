package exercicio1;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {

    }

    public Mamifero(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero(String name, float comprimento, int patas, String cor, String ambiente, float velocidade,
            String alimento) {
        super(name, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public void exibirDadosMamifero() {
        super.exibirDados();
        System.out.println("Alimento: " + alimento);
    }
}
