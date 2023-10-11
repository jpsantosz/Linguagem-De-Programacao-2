package ListaDeExercícios2.exercicio1;

public class principal {
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();

        c1.setCor("roxo");
        c1.setRaio(2);

        c2.setCor("amarelo");
        c2.setRaio(5);

        System.out.println("Dados do círculo 1: ");
        c1.exibirDados();
        System.out.println("Dados do círculo 2: ");
        c2.exibirDados();
    }
}
