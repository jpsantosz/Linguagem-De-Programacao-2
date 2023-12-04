package exercicio1;

public class Animal {
    private String name;
    private float comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

     public Animal() {

    }
    
    public Animal(String name, float comprimento, int patas, String cor, String ambiente, float velocidade) {
        this.name = name;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + name);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Número de patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + velocidade);
    }
}
