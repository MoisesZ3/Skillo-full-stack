package ListaDeFilmes;

public class Filme {
    private String titulo;
    private String genero;
    private int aviliacao;

    public Filme(String titulo, String genero, int aviliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.aviliacao = aviliacao;
    }

    public int getAviliacao() {
        return aviliacao;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo + " Gênero: " + genero + " Avaliação: (" + aviliacao + ")";
    }
}
