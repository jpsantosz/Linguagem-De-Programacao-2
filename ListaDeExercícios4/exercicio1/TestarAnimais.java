package exercicio1;

public class TestarAnimais {
    public static void main(String[] args) {
        Animal animal = new Animal("Leão", 2.5f, 4, "Marrom", "Terra", 20.5f);
        animal.exibirDados();
        System.out.println();

        // Teste para Peixe
        Peixe peixe = new Peixe("Tubarão", 3.0f, 0, "Cinza", "Oceano", 25.0f, "Barbatana", "grande");
        peixe.exibirDadosPeixe();
        System.out.println();

        // Teste para Mamífero
        Mamifero mamifero = new Mamifero("Elefante", 4.0f, 4, "Cinza", "Terra", 10.0f, "Vegetais");
        mamifero.exibirDadosMamifero();

    }
}