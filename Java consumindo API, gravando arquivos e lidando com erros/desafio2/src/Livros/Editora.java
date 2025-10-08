package Livros;

public class Editora {
    protected String nome;
    protected String local;

    @Override
    public String toString() {
        return "nome= " + nome +
                " - local= " + local;
    }
}
