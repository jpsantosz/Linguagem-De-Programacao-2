package exercicio1;

public class Peixe extends Animal {
    private String barbatana;
    private String cauda;

    public Peixe() {

    }

    public Peixe(String barbatana, String cauda) {
        this.barbatana = barbatana;
        this.cauda = cauda;
    }

    public Peixe(String name, float comprimento, int patas, String cor, String ambiente, float velocidade,
            String barbatana, String cauda) {
        super(name, comprimento, patas, cor, ambiente, velocidade);
        this.barbatana = barbatana;
        this.cauda = cauda;
    }

    public String getBarbatana() {
        return barbatana;
    }

    public void setBarbatana(String barbatana) {
        this.barbatana = barbatana;
    }

    public String getCauda() {
        return cauda;
    }

    public void setCauda(String cauda) {
        this.cauda = cauda;
    }
    
    public void exibirDadosPeixe() {
        super.exibirDados();
        System.out.println("Barbatana: " + barbatana);
        System.out.println("Cauda: " + cauda);
    }
}
