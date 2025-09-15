package ListaDeAtletas;

public class Atleta {
    private String nome;
    private String modalidade;
    private int pontuacao;

    public Atleta(String nome, String modalidade, int pontuacao) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return "Atleta: " + nome + " Modalidade: " + modalidade + " Pontuação: (" + pontuacao + ")";
    }
}
