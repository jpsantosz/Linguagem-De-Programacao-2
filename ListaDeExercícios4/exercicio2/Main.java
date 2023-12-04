package exercicio2;

public class Main {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("TV");
        equipamento.liga();
        System.out.println("Equipamento " + equipamento.getNome() + " está ligado: " + equipamento.isLigado());
        equipamento.desliga();
        System.out.println("Equipamento " + equipamento.getNome() + " está ligado: " + equipamento.isLigado());

        System.out.println();

        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro("Som");
        equipamentoSonoro.liga();
        System.out.println("EquipamentoSonoro " + equipamentoSonoro.getNome() +
                " está ligado: " + equipamentoSonoro.isLigado());
        System.out.println("Volume: " + equipamentoSonoro.getVolume());
        System.out.println("Stereo: " + equipamentoSonoro.isStereo());

        equipamentoSonoro.ativarMono();
        System.out.println("Stereo: " + equipamentoSonoro.isStereo());

        equipamentoSonoro.desliga();
        System.out.println("EquipamentoSonoro " + equipamentoSonoro.getNome() +
                " está ligado: " + equipamentoSonoro.isLigado());
    }
}
