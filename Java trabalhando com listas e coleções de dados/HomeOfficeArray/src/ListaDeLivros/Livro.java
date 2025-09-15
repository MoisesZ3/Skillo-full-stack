package ListaDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicao;

    public Livro(String titulo, String autor, int anoDePublicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicao = anoDePublicao;
    }

    public int getAnoDePublicao() {
        return anoDePublicao;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " Ano de publição: (" + anoDePublicao + ")";
    }
}
