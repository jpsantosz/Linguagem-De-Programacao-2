package Atividade4;

public class Filme {
    private String titulo;
    private String descricao;
    private Diretor diretor;
    private int duracaoEmMinutos;

    public Filme() {

    }

    public Filme(String titulo, String descricao, Diretor diretor, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String exibirDuracaoEmHoras() {
        int horas = this.duracaoEmMinutos/60;
        int minutos = this.duracaoEmMinutos%60;

        return "O filme possui " + horas + " horas e " + minutos + " minutos";
    }

    public boolean compararTitulo(String outroTitulo) {
        return titulo.equalsIgnoreCase(outroTitulo);
    }

    public void exibirDados() {
        System.out.println("Título do filme: " + titulo);
        System.out.println("Descrição do filme: " + descricao);
        System.out.println("Diretor do filme: " + diretor.getNome());
        System.out.println("Tempo de duração: " + exibirDuracaoEmHoras());
        System.out.println("Detalhes do diretor: ");
        diretor.exibirDados();
    }
}
