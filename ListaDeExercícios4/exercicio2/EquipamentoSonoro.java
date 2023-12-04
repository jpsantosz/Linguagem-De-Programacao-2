package exercicio2;

public class EquipamentoSonoro extends Equipamento {
    private short volume;
    private boolean stereo;

    public EquipamentoSonoro(String nome) {
        super(nome);
        this.volume = 5;
        this.stereo = true;
    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    public boolean isStereo() {
        return stereo;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }

    public void ativarMono() {
        this.stereo = false;
    }

    public void ativarStereo() {
        this.stereo = true;
    }

    @Override
    public void liga() {
        super.liga();
        this.volume = 5; // Ao ligar, ajusta automaticamente o volume para 5
    }

    
}
