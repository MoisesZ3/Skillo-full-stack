package Livros;

public class Livro {
    protected String titulo;
    protected String autor;
    protected Editora editora;

    @Override
    public String toString() {
        return "titulo= " + titulo +
                " - autor= " + autor +
                " - editora = (" + editora + ")";
    }
}
