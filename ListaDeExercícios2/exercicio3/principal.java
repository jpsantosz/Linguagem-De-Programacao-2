package ListaDeExercícios2.exercicio3;

public class principal {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2,2,4);
        Triangulo t2 = new Triangulo(4,5,6);

        System.out.println("Dados do triângulo 1: ");
        t1.exibirDados();
        System.out.println("Dados do triângulo 2: ");
        t2.exibirDados();
    }
}
