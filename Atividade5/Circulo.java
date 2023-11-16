package Atividade5;

public class Circulo extends Forma{
    private float raio; 

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio); 
    }

    @Override 
    public float calcularPerimetro() {
        return (float) (2 * raio * Math.PI); 
    }

    public void exibirdDados() {
        System.out.println("DADOS DO CÍRCULO: ");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
