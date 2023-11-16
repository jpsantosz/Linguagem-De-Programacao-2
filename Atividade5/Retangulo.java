package Atividade5;

public class Retangulo extends Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (lado + altura);
    }

    public void exibirdDados() {
        System.out.println("DADOS DO RETÂNGULO: ");
        System.out.println("Lado: " + lado);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
    
}

