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
