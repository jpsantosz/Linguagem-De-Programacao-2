package Atividade5;

public class Quadrado extends Forma {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

   @Override
   public float calcularArea() {
        return lado * lado;
   }

   @Override
   public float calcularPerimetro() {
        return 4 * lado;
   }

    public void exibirDados() {
        System.out.println("DADOS DO QUADRADO:");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
